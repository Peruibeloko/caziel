import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Caziel extends CazielBaseListener {

  private String className;
  private StringBuilder codegen;
  private int indentDepth = 0;

  public Caziel() {
    codegen = new StringBuilder();
  }

  private void insertCode(String... code) {
    for (int i = 0; i < indentDepth; i++)
      codegen.append('\t');
    for (String string : code) {
      codegen.append(string);
    }
    codegen.append('\n');
  }

  @Override
  public void enterPrograma(CazielParser.ProgramaContext ctx) {
    className = ctx.ID().getText();
    insertCode("public class ", className, " {");
    indentDepth++;
  }

  @Override
  public void exitPrograma(CazielParser.ProgramaContext ctx) {
    insertCode("}");
    
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
}
