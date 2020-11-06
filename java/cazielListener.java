// Generated from caziel.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cazielParser}.
 */
public interface cazielListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cazielParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(cazielParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(cazielParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(cazielParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(cazielParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(cazielParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(cazielParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(cazielParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(cazielParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(cazielParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(cazielParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(cazielParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(cazielParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(cazielParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(cazielParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(cazielParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(cazielParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(cazielParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(cazielParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(cazielParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(cazielParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(cazielParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(cazielParser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#io}.
	 * @param ctx the parse tree
	 */
	void enterIo(cazielParser.IoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#io}.
	 * @param ctx the parse tree
	 */
	void exitIo(cazielParser.IoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(cazielParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(cazielParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(cazielParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(cazielParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(cazielParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(cazielParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link cazielParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(cazielParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link cazielParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(cazielParser.SaidaContext ctx);
}