// Generated from Caziel.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CazielParser}.
 */
public interface CazielListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CazielParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CazielParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CazielParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CazielParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CazielParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CazielParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CazielParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(CazielParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(CazielParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CazielParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CazielParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CazielParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CazielParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(CazielParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(CazielParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(CazielParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(CazielParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(CazielParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(CazielParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(CazielParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(CazielParser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#io}.
	 * @param ctx the parse tree
	 */
	void enterIo(CazielParser.IoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#io}.
	 * @param ctx the parse tree
	 */
	void exitIo(CazielParser.IoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(CazielParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(CazielParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CazielParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CazielParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(CazielParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(CazielParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(CazielParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(CazielParser.SaidaContext ctx);
}