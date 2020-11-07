import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CazielCompiler {
  public static void main(String[] args) throws Exception {
    
    CharStream input = CharStreams.fromFileName(args[0]);
    CazielLexer lexer = new CazielLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    CazielParser parser = new CazielParser(tokens);

    ParseTree tree = parser.programa();

    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(new Caziel(), tree);
  }
}
