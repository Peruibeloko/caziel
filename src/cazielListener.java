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
	 * Enter a parse tree produced by {@link CazielParser#expHead}.
	 * @param ctx the parse tree
	 */
	void enterExpHead(CazielParser.ExpHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#expHead}.
	 * @param ctx the parse tree
	 */
	void exitExpHead(CazielParser.ExpHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#expTail}.
	 * @param ctx the parse tree
	 */
	void enterExpTail(CazielParser.ExpTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#expTail}.
	 * @param ctx the parse tree
	 */
	void exitExpTail(CazielParser.ExpTailContext ctx);
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
	 * Enter a parse tree produced by {@link CazielParser#conditionIf}.
	 * @param ctx the parse tree
	 */
	void enterConditionIf(CazielParser.ConditionIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#conditionIf}.
	 * @param ctx the parse tree
	 */
	void exitConditionIf(CazielParser.ConditionIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#conditionIfHead}.
	 * @param ctx the parse tree
	 */
	void enterConditionIfHead(CazielParser.ConditionIfHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#conditionIfHead}.
	 * @param ctx the parse tree
	 */
	void exitConditionIfHead(CazielParser.ConditionIfHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#conditionIfTail}.
	 * @param ctx the parse tree
	 */
	void enterConditionIfTail(CazielParser.ConditionIfTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#conditionIfTail}.
	 * @param ctx the parse tree
	 */
	void exitConditionIfTail(CazielParser.ConditionIfTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#conditionElseIf}.
	 * @param ctx the parse tree
	 */
	void enterConditionElseIf(CazielParser.ConditionElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#conditionElseIf}.
	 * @param ctx the parse tree
	 */
	void exitConditionElseIf(CazielParser.ConditionElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#conditionElseIfHead}.
	 * @param ctx the parse tree
	 */
	void enterConditionElseIfHead(CazielParser.ConditionElseIfHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#conditionElseIfHead}.
	 * @param ctx the parse tree
	 */
	void exitConditionElseIfHead(CazielParser.ConditionElseIfHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#conditionElseIfTail}.
	 * @param ctx the parse tree
	 */
	void enterConditionElseIfTail(CazielParser.ConditionElseIfTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#conditionElseIfTail}.
	 * @param ctx the parse tree
	 */
	void exitConditionElseIfTail(CazielParser.ConditionElseIfTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#conditionElse}.
	 * @param ctx the parse tree
	 */
	void enterConditionElse(CazielParser.ConditionElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#conditionElse}.
	 * @param ctx the parse tree
	 */
	void exitConditionElse(CazielParser.ConditionElseContext ctx);
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
	 * Enter a parse tree produced by {@link CazielParser#forLoopDecl}.
	 * @param ctx the parse tree
	 */
	void enterForLoopDecl(CazielParser.ForLoopDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#forLoopDecl}.
	 * @param ctx the parse tree
	 */
	void exitForLoopDecl(CazielParser.ForLoopDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#forLoopDeclVar}.
	 * @param ctx the parse tree
	 */
	void enterForLoopDeclVar(CazielParser.ForLoopDeclVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#forLoopDeclVar}.
	 * @param ctx the parse tree
	 */
	void exitForLoopDeclVar(CazielParser.ForLoopDeclVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#forLoopDeclCheck}.
	 * @param ctx the parse tree
	 */
	void enterForLoopDeclCheck(CazielParser.ForLoopDeclCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#forLoopDeclCheck}.
	 * @param ctx the parse tree
	 */
	void exitForLoopDeclCheck(CazielParser.ForLoopDeclCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#forLoopDeclUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForLoopDeclUpdate(CazielParser.ForLoopDeclUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#forLoopDeclUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForLoopDeclUpdate(CazielParser.ForLoopDeclUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#forLoopBody}.
	 * @param ctx the parse tree
	 */
	void enterForLoopBody(CazielParser.ForLoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#forLoopBody}.
	 * @param ctx the parse tree
	 */
	void exitForLoopBody(CazielParser.ForLoopBodyContext ctx);
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
	 * Enter a parse tree produced by {@link CazielParser#whileLoopHead}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoopHead(CazielParser.WhileLoopHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#whileLoopHead}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoopHead(CazielParser.WhileLoopHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#whileLoopTail}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoopTail(CazielParser.WhileLoopTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#whileLoopTail}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoopTail(CazielParser.WhileLoopTailContext ctx);
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
	 * Enter a parse tree produced by {@link CazielParser#doWhileHead}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileHead(CazielParser.DoWhileHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#doWhileHead}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileHead(CazielParser.DoWhileHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CazielParser#doWhileTail}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileTail(CazielParser.DoWhileTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CazielParser#doWhileTail}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileTail(CazielParser.DoWhileTailContext ctx);
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