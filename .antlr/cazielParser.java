// Generated from d:\Arquivos\Organizacao\Anhembi\Matérias\8° Semestre\Compiladores\caziel\Caziel.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CazielParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, STR=16, INT=17, 
		DEC=18, BOOL=19, TIPO=20, ID=21, OP_MAT_PREC_1=22, OP_MAT_PREC_2=23, OP_BOOL_PREC_1=24, 
		OP_BOOL_PREC_2=25, OP_ATTR=26, WS=27;
	public static final int
		RULE_programa = 0, RULE_statement = 1, RULE_var = 2, RULE_attr = 3, RULE_expHead = 4, 
		RULE_expTail = 5, RULE_condition = 6, RULE_conditionIf = 7, RULE_conditionIfHead = 8, 
		RULE_conditionIfTail = 9, RULE_conditionElseIf = 10, RULE_conditionElseIfHead = 11, 
		RULE_conditionElseIfTail = 12, RULE_conditionElse = 13, RULE_loop = 14, 
		RULE_forLoop = 15, RULE_forLoopDecl = 16, RULE_forLoopDeclVar = 17, RULE_forLoopDeclCheck = 18, 
		RULE_forLoopDeclUpdate = 19, RULE_forLoopBody = 20, RULE_whileLoop = 21, 
		RULE_whileLoopHead = 22, RULE_whileLoopTail = 23, RULE_doWhile = 24, RULE_doWhileHead = 25, 
		RULE_doWhileTail = 26, RULE_io = 27, RULE_op = 28, RULE_literal = 29, 
		RULE_entrada = 30, RULE_saida = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "statement", "var", "attr", "expHead", "expTail", "condition", 
			"conditionIf", "conditionIfHead", "conditionIfTail", "conditionElseIf", 
			"conditionElseIfHead", "conditionElseIfTail", "conditionElse", "loop", 
			"forLoop", "forLoopDecl", "forLoopDeclVar", "forLoopDeclCheck", "forLoopDeclUpdate", 
			"forLoopBody", "whileLoop", "whileLoopHead", "whileLoopTail", "doWhile", 
			"doWhileHead", "doWhileTail", "io", "op", "literal", "entrada", "saida"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'var'", "';'", "'se'", "'('", "')'", "'entao'", 
			"'se nao'", "'para:'", "'faca'", "'enquanto:'", "'leia:'", "','", "'imprima:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "STR", "INT", "DEC", "BOOL", "TIPO", "ID", "OP_MAT_PREC_1", 
			"OP_MAT_PREC_2", "OP_BOOL_PREC_1", "OP_BOOL_PREC_2", "OP_ATTR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Caziel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CazielParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CazielParser.ID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(65);
			match(T__0);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public ExpHeadContext expHead() {
			return getRuleContext(ExpHeadContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public IoContext io() {
			return getRuleContext(IoContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				attr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				expHead();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				io();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(CazielParser.TIPO, 0); }
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode ID() { return getToken(CazielParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__2);
			setState(83);
			match(TIPO);
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(84);
				match(ID);
				setState(85);
				match(T__3);
				}
				}
				break;
			case 2:
				{
				setState(86);
				attr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CazielParser.ID, 0); }
		public TerminalNode OP_ATTR() { return getToken(CazielParser.OP_ATTR, 0); }
		public ExpHeadContext expHead() {
			return getRuleContext(ExpHeadContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(90);
			match(OP_ATTR);
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(91);
				expHead();
				}
				break;
			case 2:
				{
				setState(92);
				literal();
				}
				break;
			}
			setState(95);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpHeadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CazielParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<ExpTailContext> expTail() {
			return getRuleContexts(ExpTailContext.class);
		}
		public ExpTailContext expTail(int i) {
			return getRuleContext(ExpTailContext.class,i);
		}
		public ExpHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expHead; }
	}

	public final ExpHeadContext expHead() throws RecognitionException {
		ExpHeadContext _localctx = new ExpHeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(97);
				match(ID);
				}
				break;
			case STR:
			case INT:
			case DEC:
			case BOOL:
				{
				setState(98);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				expTail();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OP_MAT_PREC_1 || _la==OP_BOOL_PREC_1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpTailContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode ID() { return getToken(CazielParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expTail; }
	}

	public final ExpTailContext expTail() throws RecognitionException {
		ExpTailContext _localctx = new ExpTailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			op();
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(107);
				match(ID);
				}
				break;
			case STR:
			case INT:
			case DEC:
			case BOOL:
				{
				setState(108);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionIfContext conditionIf() {
			return getRuleContext(ConditionIfContext.class,0);
		}
		public List<ConditionElseIfContext> conditionElseIf() {
			return getRuleContexts(ConditionElseIfContext.class);
		}
		public ConditionElseIfContext conditionElseIf(int i) {
			return getRuleContext(ConditionElseIfContext.class,i);
		}
		public ConditionElseContext conditionElse() {
			return getRuleContext(ConditionElseContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			conditionIf();
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					conditionElseIf();
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(118);
				conditionElse();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionIfContext extends ParserRuleContext {
		public ConditionIfHeadContext conditionIfHead() {
			return getRuleContext(ConditionIfHeadContext.class,0);
		}
		public ConditionIfTailContext conditionIfTail() {
			return getRuleContext(ConditionIfTailContext.class,0);
		}
		public ConditionIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionIf; }
	}

	public final ConditionIfContext conditionIf() throws RecognitionException {
		ConditionIfContext _localctx = new ConditionIfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditionIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			conditionIfHead();
			setState(122);
			conditionIfTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionIfHeadContext extends ParserRuleContext {
		public ExpHeadContext expHead() {
			return getRuleContext(ExpHeadContext.class,0);
		}
		public TerminalNode ID() { return getToken(CazielParser.ID, 0); }
		public ConditionIfHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionIfHead; }
	}

	public final ConditionIfHeadContext conditionIfHead() throws RecognitionException {
		ConditionIfHeadContext _localctx = new ConditionIfHeadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionIfHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__4);
			setState(125);
			match(T__5);
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(126);
				expHead();
				}
				break;
			case 2:
				{
				setState(127);
				match(ID);
				}
				break;
			}
			setState(130);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionIfTailContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionIfTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionIfTail; }
	}

	public final ConditionIfTailContext conditionIfTail() throws RecognitionException {
		ConditionIfTailContext _localctx = new ConditionIfTailContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionIfTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__7);
			setState(133);
			match(T__0);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(134);
				statement();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionElseIfContext extends ParserRuleContext {
		public ConditionElseIfHeadContext conditionElseIfHead() {
			return getRuleContext(ConditionElseIfHeadContext.class,0);
		}
		public ConditionElseIfTailContext conditionElseIfTail() {
			return getRuleContext(ConditionElseIfTailContext.class,0);
		}
		public ConditionElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionElseIf; }
	}

	public final ConditionElseIfContext conditionElseIf() throws RecognitionException {
		ConditionElseIfContext _localctx = new ConditionElseIfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditionElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			conditionElseIfHead();
			setState(143);
			conditionElseIfTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionElseIfHeadContext extends ParserRuleContext {
		public ExpHeadContext expHead() {
			return getRuleContext(ExpHeadContext.class,0);
		}
		public TerminalNode ID() { return getToken(CazielParser.ID, 0); }
		public ConditionElseIfHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionElseIfHead; }
	}

	public final ConditionElseIfHeadContext conditionElseIfHead() throws RecognitionException {
		ConditionElseIfHeadContext _localctx = new ConditionElseIfHeadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditionElseIfHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__8);
			setState(146);
			match(T__4);
			setState(147);
			match(T__5);
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(148);
				expHead();
				}
				break;
			case 2:
				{
				setState(149);
				match(ID);
				}
				break;
			}
			setState(152);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionElseIfTailContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionElseIfTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionElseIfTail; }
	}

	public final ConditionElseIfTailContext conditionElseIfTail() throws RecognitionException {
		ConditionElseIfTailContext _localctx = new ConditionElseIfTailContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditionElseIfTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__7);
			setState(155);
			match(T__0);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(156);
				statement();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionElseContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionElse; }
	}

	public final ConditionElseContext conditionElse() throws RecognitionException {
		ConditionElseContext _localctx = new ConditionElseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__8);
			setState(165);
			match(T__7);
			setState(166);
			match(T__0);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(167);
				statement();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DoWhileContext doWhile() {
			return getRuleContext(DoWhileContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loop);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				forLoop();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				whileLoop();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				doWhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public ForLoopDeclContext forLoopDecl() {
			return getRuleContext(ForLoopDeclContext.class,0);
		}
		public ForLoopBodyContext forLoopBody() {
			return getRuleContext(ForLoopBodyContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			forLoopDecl();
			setState(181);
			forLoopBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopDeclContext extends ParserRuleContext {
		public ForLoopDeclVarContext forLoopDeclVar() {
			return getRuleContext(ForLoopDeclVarContext.class,0);
		}
		public ForLoopDeclCheckContext forLoopDeclCheck() {
			return getRuleContext(ForLoopDeclCheckContext.class,0);
		}
		public ForLoopDeclUpdateContext forLoopDeclUpdate() {
			return getRuleContext(ForLoopDeclUpdateContext.class,0);
		}
		public ForLoopDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopDecl; }
	}

	public final ForLoopDeclContext forLoopDecl() throws RecognitionException {
		ForLoopDeclContext _localctx = new ForLoopDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forLoopDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			forLoopDeclVar();
			setState(184);
			forLoopDeclCheck();
			setState(185);
			forLoopDeclUpdate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopDeclVarContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public ForLoopDeclVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopDeclVar; }
	}

	public final ForLoopDeclVarContext forLoopDeclVar() throws RecognitionException {
		ForLoopDeclVarContext _localctx = new ForLoopDeclVarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forLoopDeclVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__9);
			setState(188);
			match(T__5);
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(189);
				var();
				}
				break;
			case ID:
				{
				setState(190);
				attr();
				}
				break;
			case T__3:
				break;
			default:
				break;
			}
			setState(193);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopDeclCheckContext extends ParserRuleContext {
		public ExpHeadContext expHead() {
			return getRuleContext(ExpHeadContext.class,0);
		}
		public ForLoopDeclCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopDeclCheck; }
	}

	public final ForLoopDeclCheckContext forLoopDeclCheck() throws RecognitionException {
		ForLoopDeclCheckContext _localctx = new ForLoopDeclCheckContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forLoopDeclCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			expHead();
			setState(196);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopDeclUpdateContext extends ParserRuleContext {
		public ExpHeadContext expHead() {
			return getRuleContext(ExpHeadContext.class,0);
		}
		public ForLoopDeclUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopDeclUpdate; }
	}

	public final ForLoopDeclUpdateContext forLoopDeclUpdate() throws RecognitionException {
		ForLoopDeclUpdateContext _localctx = new ForLoopDeclUpdateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forLoopDeclUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			expHead();
			setState(199);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopBody; }
	}

	public final ForLoopBodyContext forLoopBody() throws RecognitionException {
		ForLoopBodyContext _localctx = new ForLoopBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forLoopBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__10);
			setState(202);
			match(T__0);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(203);
				statement();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public WhileLoopHeadContext whileLoopHead() {
			return getRuleContext(WhileLoopHeadContext.class,0);
		}
		public WhileLoopTailContext whileLoopTail() {
			return getRuleContext(WhileLoopTailContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			whileLoopHead();
			setState(212);
			whileLoopTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopHeadContext extends ParserRuleContext {
		public ExpHeadContext expHead() {
			return getRuleContext(ExpHeadContext.class,0);
		}
		public WhileLoopHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoopHead; }
	}

	public final WhileLoopHeadContext whileLoopHead() throws RecognitionException {
		WhileLoopHeadContext _localctx = new WhileLoopHeadContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileLoopHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__11);
			setState(215);
			match(T__5);
			setState(216);
			expHead();
			setState(217);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopTailContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoopTail; }
	}

	public final WhileLoopTailContext whileLoopTail() throws RecognitionException {
		WhileLoopTailContext _localctx = new WhileLoopTailContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whileLoopTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__10);
			setState(220);
			match(T__0);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(221);
				statement();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileContext extends ParserRuleContext {
		public DoWhileHeadContext doWhileHead() {
			return getRuleContext(DoWhileHeadContext.class,0);
		}
		public DoWhileTailContext doWhileTail() {
			return getRuleContext(DoWhileTailContext.class,0);
		}
		public DoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhile; }
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			doWhileHead();
			setState(230);
			doWhileTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileHeadContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DoWhileHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileHead; }
	}

	public final DoWhileHeadContext doWhileHead() throws RecognitionException {
		DoWhileHeadContext _localctx = new DoWhileHeadContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_doWhileHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__10);
			setState(233);
			match(T__0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(234);
				statement();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileTailContext extends ParserRuleContext {
		public ExpHeadContext expHead() {
			return getRuleContext(ExpHeadContext.class,0);
		}
		public DoWhileTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileTail; }
	}

	public final DoWhileTailContext doWhileTail() throws RecognitionException {
		DoWhileTailContext _localctx = new DoWhileTailContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_doWhileTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__11);
			setState(243);
			match(T__5);
			setState(244);
			expHead();
			setState(245);
			match(T__6);
			setState(246);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IoContext extends ParserRuleContext {
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public IoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io; }
	}

	public final IoContext io() throws RecognitionException {
		IoContext _localctx = new IoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_io);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				entrada();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				saida();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode OP_MAT_PREC_1() { return getToken(CazielParser.OP_MAT_PREC_1, 0); }
		public TerminalNode OP_BOOL_PREC_1() { return getToken(CazielParser.OP_BOOL_PREC_1, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !(_la==OP_MAT_PREC_1 || _la==OP_BOOL_PREC_1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(CazielParser.STR, 0); }
		public TerminalNode INT() { return getToken(CazielParser.INT, 0); }
		public TerminalNode DEC() { return getToken(CazielParser.DEC, 0); }
		public TerminalNode BOOL() { return getToken(CazielParser.BOOL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntradaContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(CazielParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(CazielParser.ID, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__12);
			setState(257);
			match(TIPO);
			setState(258);
			match(T__13);
			setState(259);
			match(ID);
			setState(260);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SaidaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CazielParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpHeadContext expHead() {
			return getRuleContext(ExpHeadContext.class,0);
		}
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__14);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(263);
				match(ID);
				}
				break;
			case 2:
				{
				setState(264);
				literal();
				}
				break;
			case 3:
				{
				setState(265);
				expHead();
				}
				break;
			}
			setState(268);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0111\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3S\n\3\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\5\5`\n\5\3\5"+
		"\3\5\3\6\3\6\5\6f\n\6\3\6\6\6i\n\6\r\6\16\6j\3\7\3\7\3\7\5\7p\n\7\3\b"+
		"\3\b\7\bt\n\b\f\b\16\bw\13\b\3\b\5\bz\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\5\n\u0083\n\n\3\n\3\n\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0099\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\7\17\u00ab\n\17\f\17\16\17\u00ae\13\17\3\17\3\17\3\20"+
		"\3\20\3\20\5\20\u00b5\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\5\23\u00c2\n\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\7\26\u00cf\n\26\f\26\16\26\u00d2\13\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u00e1\n\31\f\31\16"+
		"\31\u00e4\13\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u00ee\n\33"+
		"\f\33\16\33\u00f1\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\5\35\u00fd\n\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!"+
		"\5!\u010d\n!\3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@\2\4\4\2\30\30\32\32\3\2\22\25\2\u010c\2B\3\2\2"+
		"\2\4R\3\2\2\2\6T\3\2\2\2\b[\3\2\2\2\ne\3\2\2\2\fl\3\2\2\2\16q\3\2\2\2"+
		"\20{\3\2\2\2\22~\3\2\2\2\24\u0086\3\2\2\2\26\u0090\3\2\2\2\30\u0093\3"+
		"\2\2\2\32\u009c\3\2\2\2\34\u00a6\3\2\2\2\36\u00b4\3\2\2\2 \u00b6\3\2\2"+
		"\2\"\u00b9\3\2\2\2$\u00bd\3\2\2\2&\u00c5\3\2\2\2(\u00c8\3\2\2\2*\u00cb"+
		"\3\2\2\2,\u00d5\3\2\2\2.\u00d8\3\2\2\2\60\u00dd\3\2\2\2\62\u00e7\3\2\2"+
		"\2\64\u00ea\3\2\2\2\66\u00f4\3\2\2\28\u00fc\3\2\2\2:\u00fe\3\2\2\2<\u0100"+
		"\3\2\2\2>\u0102\3\2\2\2@\u0108\3\2\2\2BC\7\27\2\2CG\7\3\2\2DF\5\4\3\2"+
		"ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\4\2\2"+
		"K\3\3\2\2\2LS\5\6\4\2MS\5\b\5\2NS\5\n\6\2OS\5\16\b\2PS\5\36\20\2QS\58"+
		"\35\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\5\3"+
		"\2\2\2TU\7\5\2\2UY\7\26\2\2VW\7\27\2\2WZ\7\6\2\2XZ\5\b\5\2YV\3\2\2\2Y"+
		"X\3\2\2\2Z\7\3\2\2\2[\\\7\27\2\2\\_\7\34\2\2]`\5\n\6\2^`\5<\37\2_]\3\2"+
		"\2\2_^\3\2\2\2`a\3\2\2\2ab\7\6\2\2b\t\3\2\2\2cf\7\27\2\2df\5<\37\2ec\3"+
		"\2\2\2ed\3\2\2\2fh\3\2\2\2gi\5\f\7\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3"+
		"\2\2\2k\13\3\2\2\2lo\5:\36\2mp\7\27\2\2np\5<\37\2om\3\2\2\2on\3\2\2\2"+
		"p\r\3\2\2\2qu\5\20\t\2rt\5\26\f\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2"+
		"\2\2vy\3\2\2\2wu\3\2\2\2xz\5\34\17\2yx\3\2\2\2yz\3\2\2\2z\17\3\2\2\2{"+
		"|\5\22\n\2|}\5\24\13\2}\21\3\2\2\2~\177\7\7\2\2\177\u0082\7\b\2\2\u0080"+
		"\u0083\5\n\6\2\u0081\u0083\7\27\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\t\2\2\u0085\23\3\2\2\2\u0086"+
		"\u0087\7\n\2\2\u0087\u008b\7\3\2\2\u0088\u008a\5\4\3\2\u0089\u0088\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\4\2\2\u008f\25\3\2\2"+
		"\2\u0090\u0091\5\30\r\2\u0091\u0092\5\32\16\2\u0092\27\3\2\2\2\u0093\u0094"+
		"\7\13\2\2\u0094\u0095\7\7\2\2\u0095\u0098\7\b\2\2\u0096\u0099\5\n\6\2"+
		"\u0097\u0099\7\27\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\7\t\2\2\u009b\31\3\2\2\2\u009c\u009d\7\n\2\2\u009d"+
		"\u00a1\7\3\2\2\u009e\u00a0\5\4\3\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\4\2\2\u00a5\33\3\2\2\2\u00a6\u00a7\7\13\2"+
		"\2\u00a7\u00a8\7\n\2\2\u00a8\u00ac\7\3\2\2\u00a9\u00ab\5\4\3\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\4\2\2\u00b0\35\3\2\2"+
		"\2\u00b1\u00b5\5 \21\2\u00b2\u00b5\5,\27\2\u00b3\u00b5\5\62\32\2\u00b4"+
		"\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\37\3\2\2"+
		"\2\u00b6\u00b7\5\"\22\2\u00b7\u00b8\5*\26\2\u00b8!\3\2\2\2\u00b9\u00ba"+
		"\5$\23\2\u00ba\u00bb\5&\24\2\u00bb\u00bc\5(\25\2\u00bc#\3\2\2\2\u00bd"+
		"\u00be\7\f\2\2\u00be\u00c1\7\b\2\2\u00bf\u00c2\5\6\4\2\u00c0\u00c2\5\b"+
		"\5\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\7\6\2\2\u00c4%\3\2\2\2\u00c5\u00c6\5\n\6\2"+
		"\u00c6\u00c7\7\6\2\2\u00c7\'\3\2\2\2\u00c8\u00c9\5\n\6\2\u00c9\u00ca\7"+
		"\t\2\2\u00ca)\3\2\2\2\u00cb\u00cc\7\r\2\2\u00cc\u00d0\7\3\2\2\u00cd\u00cf"+
		"\5\4\3\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\4"+
		"\2\2\u00d4+\3\2\2\2\u00d5\u00d6\5.\30\2\u00d6\u00d7\5\60\31\2\u00d7-\3"+
		"\2\2\2\u00d8\u00d9\7\16\2\2\u00d9\u00da\7\b\2\2\u00da\u00db\5\n\6\2\u00db"+
		"\u00dc\7\t\2\2\u00dc/\3\2\2\2\u00dd\u00de\7\r\2\2\u00de\u00e2\7\3\2\2"+
		"\u00df\u00e1\5\4\3\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e6\7\4\2\2\u00e6\61\3\2\2\2\u00e7\u00e8\5\64\33\2\u00e8\u00e9\5\66"+
		"\34\2\u00e9\63\3\2\2\2\u00ea\u00eb\7\r\2\2\u00eb\u00ef\7\3\2\2\u00ec\u00ee"+
		"\5\4\3\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\4"+
		"\2\2\u00f3\65\3\2\2\2\u00f4\u00f5\7\16\2\2\u00f5\u00f6\7\b\2\2\u00f6\u00f7"+
		"\5\n\6\2\u00f7\u00f8\7\t\2\2\u00f8\u00f9\7\6\2\2\u00f9\67\3\2\2\2\u00fa"+
		"\u00fd\5> \2\u00fb\u00fd\5@!\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd9\3\2\2\2\u00fe\u00ff\t\2\2\2\u00ff;\3\2\2\2\u0100\u0101\t\3\2\2"+
		"\u0101=\3\2\2\2\u0102\u0103\7\17\2\2\u0103\u0104\7\26\2\2\u0104\u0105"+
		"\7\20\2\2\u0105\u0106\7\27\2\2\u0106\u0107\7\6\2\2\u0107?\3\2\2\2\u0108"+
		"\u010c\7\21\2\2\u0109\u010d\7\27\2\2\u010a\u010d\5<\37\2\u010b\u010d\5"+
		"\n\6\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\7\6\2\2\u010fA\3\2\2\2\27GRY_ejouy\u0082\u008b"+
		"\u0098\u00a1\u00ac\u00b4\u00c1\u00d0\u00e2\u00ef\u00fc\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}