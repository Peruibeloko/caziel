import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.TerminalNode;

public class Caziel extends CazielBaseListener {

  private String className;
  private StringBuilder codegen;
  private int indentDepth = 0;
  private boolean usesInput = false;
  private HashMap<String, String> symTab;

  public Caziel() {
    codegen = new StringBuilder();
    symTab = new HashMap<String, String>();
  }

  private void insertCode(boolean isNewLine, String... code) {
    if (isNewLine)
      for (int i = 0; i < indentDepth; i++)
        codegen.append("  ");

    for (String string : code) {
      codegen.append(string);
    }
  }

  @Override
  public void enterPrograma(CazielParser.ProgramaContext ctx) {
    className = ctx.ID().getText();
    insertCode(true, "public class ", className, " {\n");
    indentDepth++;
    insertCode(true, "public static void main(String[] args) {\n");
    indentDepth++;
  }

  @Override
  public void exitPrograma(CazielParser.ProgramaContext ctx) {
    indentDepth--;
    insertCode(true, "}\n");
    indentDepth--;
    insertCode(true, "}\n");

    if (usesInput)
      codegen.insert(0, "import java.util.Scanner;\n\n");

    String path = className + ".java";
    File f = new File(path);

    if (f.exists())
      f.delete();
    try {
      f.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (FileWriter fw = new FileWriter(f)) {
      fw.write(codegen.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void enterVar(CazielParser.VarContext ctx) {
    TerminalNode idTerminal = ctx.ID();
    String type = "";

    switch (ctx.TIPO().getText()) {
      case "string":
        type = "String";
        break;

      case "inteiro":
        type = "int";
        break;

      case "decimal":
        type = "double";
        break;

      case "booleano":
        type = "boolean";
        break;

      default:
        // TODO Tipo não conhecido
        break;
    }
    insertCode(true, type, " ");

    if (idTerminal != null) {
      String id = idTerminal.getText();

      if (symTab.get(id) == null) {
        insertCode(false, id, ";\n");
        symTab.put(id, "");
      }
      // TODO Variável já declarada
    }
  }

  @Override
  public void enterAttr(CazielParser.AttrContext ctx) {
    String id = ctx.ID().getText();
    String opAttr = ctx.OP_ATTR().getText();

    if (symTab.get(id) == null) {
      insertCode(false, id, " ", opAttr, " ");
      symTab.put(id, "");
    } else
      insertCode(true, id, " ", opAttr, " ");
  }

  @Override
  public void exitAttr(CazielParser.AttrContext ctx) {
    insertCode(false, ";\n");
  }

  @Override
  public void enterExpHead(CazielParser.ExpHeadContext ctx) {
    TerminalNode idNode = ctx.ID();

    if (idNode != null) {
      String id = idNode.getText();

      if (symTab.get(id) != null)
        insertCode(false, id, " ");
      // TODO Variável não declarada
    }
  }

  @Override
  public void exitExpTail(CazielParser.ExpTailContext ctx) {
    TerminalNode idNode = ctx.ID();

    if (idNode != null) {
      String id = idNode.getText();

      if (symTab.get(id) != null)
        insertCode(false, id, " ");
      // TODO Variável não declarada
    }
  }

  @Override
  public void enterConditionIfHead(CazielParser.ConditionIfHeadContext ctx) {
    insertCode(true, "if (");

    TerminalNode idNode = ctx.ID();

    if (idNode != null) {
      String id = idNode.getText();

      if (symTab.get(id) != null)
        insertCode(false, id);
      // TODO Variável não declarada
    }
  }

  @Override
  public void exitConditionIfHead(CazielParser.ConditionIfHeadContext ctx) {
    insertCode(false, ") ");
  }

  @Override
  public void enterConditionIfTail(CazielParser.ConditionIfTailContext ctx) {
    insertCode(false, "{\n");
    indentDepth++;
  }

  @Override
  public void exitConditionIfTail(CazielParser.ConditionIfTailContext ctx) {
    indentDepth--;
    insertCode(true, "}\n");
  }

  @Override
  public void enterConditionElseIfHead(CazielParser.ConditionElseIfHeadContext ctx) {
    insertCode(true, "else if (");

    TerminalNode idNode = ctx.ID();

    if (idNode != null) {
      String id = idNode.getText();

      if (symTab.get(id) != null)
        insertCode(false, id);
      // TODO Variável não declarada
    }
  }

  @Override
  public void exitConditionElseIfHead(CazielParser.ConditionElseIfHeadContext ctx) {
    insertCode(false, ") ");
  }

  @Override
  public void enterConditionElseIfTail(CazielParser.ConditionElseIfTailContext ctx) {
    insertCode(false, "{\n");
    indentDepth++;
  }

  @Override
  public void exitConditionElseIfTail(CazielParser.ConditionElseIfTailContext ctx) {
    indentDepth--;
    insertCode(true, "}\n");
  }

  @Override
  public void enterConditionElse(CazielParser.ConditionElseContext ctx) {
    insertCode(true, "else {\n");
    indentDepth++;
  }

  @Override
  public void exitConditionElse(CazielParser.ConditionElseContext ctx) {
    indentDepth--;
    insertCode(true, "}\n");
  }

  @Override
  public void enterWhileLoopHead(CazielParser.WhileLoopHeadContext ctx) {
    insertCode(true, "while (");
  }

  @Override
  public void exitWhileLoopHead(CazielParser.WhileLoopHeadContext ctx) {
    insertCode(false, ")");
  }

  @Override
  public void enterWhileLoopTail(CazielParser.WhileLoopTailContext ctx) {
    insertCode(false, "{\n");
    indentDepth++;
  }

  @Override
  public void exitWhileLoopTail(CazielParser.WhileLoopTailContext ctx) {
    indentDepth--;
    insertCode(true, "}\n");
  }

  @Override
  public void enterDoWhileHead(CazielParser.DoWhileHeadContext ctx) {
    insertCode(true, "do {\n");
    indentDepth++;
  }

  @Override
  public void exitDoWhileHead(CazielParser.DoWhileHeadContext ctx) {
    indentDepth--;
    insertCode(true, "} ");
  }

  @Override
  public void enterDoWhileTail(CazielParser.DoWhileTailContext ctx) {
    insertCode(false, "while(");
  }

  @Override
  public void exitDoWhileTail(CazielParser.DoWhileTailContext ctx) {
    insertCode(false, ");\n");
  }

  @Override
  public void enterForLoopDeclVar(CazielParser.ForLoopDeclVarContext ctx) {
    insertCode(true, "for(");
  }

  @Override
  public void exitForLoopDeclVar(CazielParser.ForLoopDeclVarContext ctx) {
    insertCode(false, "; ");
  }

  @Override
  public void exitForLoopDeclCheck(CazielParser.ForLoopDeclCheckContext ctx) {
    insertCode(false, "; ");
  }

  @Override
  public void exitForLoopDeclUpdate(CazielParser.ForLoopDeclUpdateContext ctx) {
    insertCode(false, ") ");
  }

  @Override
  public void enterForLoopBody(CazielParser.ForLoopBodyContext ctx) {
    insertCode(false, "{\n}");
    indentDepth++;
  }

  @Override
  public void exitForLoopBody(CazielParser.ForLoopBodyContext ctx) {
    indentDepth--;
    insertCode(true, "}\n");
  }

  @Override
  public void enterSaida(CazielParser.SaidaContext ctx) {
    insertCode(true, "System.out.println(");
  }

  @Override
  public void exitSaida(CazielParser.SaidaContext ctx) {
    insertCode(false, ");\n");
  }

  @Override
  public void enterEntrada(CazielParser.EntradaContext ctx) {
    String id = ctx.ID().getText();

    usesInput = true;

    insertCode(false, "\n");
    insertCode(true, "Scanner s = new Scanner(System.in);\n");
    insertCode(true, id, " = ");

    switch (ctx.TIPO().getText()) {
      case "string":
        insertCode(false, "s.nextLine();\n");
        break;

      case "inteiro":
        insertCode(false, "s.nextInt();\n");
        insertCode(true, "s.nextLine();\n");
        break;

      case "decimal":
        insertCode(false, "s.nextDouble();\n");
        insertCode(true, "s.nextLine();\n");
        break;

      case "booleano":
        insertCode(false, "s.nextBoolean();\n");
        insertCode(true, "s.nextLine();\n");
        break;

      default:
        // TODO Tipo não conhecido
        break;
    }
    insertCode(true, "s.close();\n\n");
  }

  @Override
  public void enterLiteral(CazielParser.LiteralContext ctx) {
    insertCode(false, ctx.getText(), " ");
  }

  @Override
  public void enterOp(CazielParser.OpContext ctx) {
    insertCode(false, ctx.getText(), " ");
  }

}
