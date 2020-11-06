// Generated from caziel.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cazielParser extends Parser {
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
		RULE_init = 0, RULE_programa = 1, RULE_statement = 2, RULE_var = 3, RULE_attr = 4, 
		RULE_exp = 5, RULE_condition = 6, RULE_loop = 7, RULE_forLoop = 8, RULE_whileLoop = 9, 
		RULE_doWhile = 10, RULE_io = 11, RULE_op = 12, RULE_literal = 13, RULE_entrada = 14, 
		RULE_saida = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "programa", "statement", "var", "attr", "exp", "condition", "loop", 
			"forLoop", "whileLoop", "doWhile", "io", "op", "literal", "entrada", 
			"saida"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'var'", "';'", "'se'", "'('", "')'", "'entao'", 
			"'se nao'", "'talvez'", "'para:'", "'faca'", "'enquanto:'", "'leia:'", 
			"'imprima:'"
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
	public String getGrammarFileName() { return "caziel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cazielParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			programa();
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

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cazielParser.ID, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ID);
			setState(35);
			match(T__0);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(36);
				statement();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				attr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				exp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
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
		public TerminalNode TIPO() { return getToken(cazielParser.TIPO, 0); }
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode ID() { return getToken(cazielParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__2);
			setState(53);
			match(TIPO);
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(54);
				match(ID);
				setState(55);
				match(T__3);
				}
				}
				break;
			case 2:
				{
				setState(56);
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
		public TerminalNode ID() { return getToken(cazielParser.ID, 0); }
		public TerminalNode OP_ATTR() { return getToken(cazielParser.OP_ATTR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitAttr(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(OP_ATTR);
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(61);
				exp();
				}
				break;
			case 2:
				{
				setState(62);
				literal();
				}
				break;
			}
			setState(65);
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

	public static class ExpContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(cazielParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cazielParser.ID, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(67);
				match(ID);
				}
				break;
			case STR:
			case INT:
			case DEC:
			case BOOL:
				{
				setState(68);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				op();
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(72);
					match(ID);
					}
					break;
				case STR:
				case INT:
				case DEC:
				case BOOL:
					{
					setState(73);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(78); 
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(cazielParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cazielParser.ID, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__4);
			setState(81);
			match(T__5);
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(82);
				exp();
				}
				break;
			case 2:
				{
				setState(83);
				match(ID);
				}
				break;
			}
			setState(86);
			match(T__6);
			setState(87);
			match(T__7);
			setState(88);
			match(T__0);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(89);
				statement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(T__1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					match(T__8);
					setState(97);
					match(T__4);
					setState(98);
					match(T__5);
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(99);
						exp();
						}
						break;
					case 2:
						{
						setState(100);
						match(ID);
						}
						break;
					}
					setState(103);
					match(T__6);
					setState(104);
					match(T__7);
					setState(105);
					match(T__0);
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
						{
						{
						setState(106);
						statement();
						}
						}
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(112);
					match(T__1);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(118);
				match(T__8);
				setState(119);
				match(T__7);
				setState(120);
				match(T__0);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(121);
					statement();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__1);
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(130);
				match(T__9);
				setState(131);
				match(T__7);
				setState(132);
				match(T__0);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(133);
					statement();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(T__1);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				forLoop();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				whileLoop();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
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
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__10);
			setState(148);
			match(T__5);
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(149);
				var();
				}
				break;
			case ID:
				{
				setState(150);
				attr();
				}
				break;
			case T__3:
				break;
			default:
				break;
			}
			setState(153);
			match(T__3);
			setState(154);
			exp();
			setState(155);
			match(T__3);
			setState(156);
			exp();
			setState(157);
			match(T__6);
			setState(158);
			match(T__11);
			setState(159);
			match(T__0);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(160);
				statement();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__12);
			setState(169);
			match(T__5);
			setState(170);
			exp();
			setState(171);
			match(T__6);
			setState(172);
			match(T__11);
			setState(173);
			match(T__0);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(174);
				statement();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitDoWhile(this);
		}
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_doWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__11);
			setState(183);
			match(T__0);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STR) | (1L << INT) | (1L << DEC) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(184);
				statement();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(T__1);
			setState(191);
			match(T__12);
			setState(192);
			match(T__5);
			setState(193);
			exp();
			setState(194);
			match(T__6);
			setState(195);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterIo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitIo(this);
		}
	}

	public final IoContext io() throws RecognitionException {
		IoContext _localctx = new IoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_io);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				entrada();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
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
		public TerminalNode OP_MAT_PREC_1() { return getToken(cazielParser.OP_MAT_PREC_1, 0); }
		public TerminalNode OP_BOOL_PREC_1() { return getToken(cazielParser.OP_BOOL_PREC_1, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		public TerminalNode STR() { return getToken(cazielParser.STR, 0); }
		public TerminalNode INT() { return getToken(cazielParser.INT, 0); }
		public TerminalNode DEC() { return getToken(cazielParser.DEC, 0); }
		public TerminalNode BOOL() { return getToken(cazielParser.BOOL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		public TerminalNode ID() { return getToken(cazielParser.ID, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitEntrada(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__13);
			setState(206);
			match(ID);
			setState(207);
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
		public TerminalNode ID() { return getToken(cazielParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).enterSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cazielListener ) ((cazielListener)listener).exitSaida(this);
		}
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__14);
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(210);
				match(ID);
				}
				break;
			case 2:
				{
				setState(211);
				literal();
				}
				break;
			case 3:
				{
				setState(212);
				exp();
				}
				break;
			}
			setState(215);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00dc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\65\n\4\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\5\6B\n\6\3\6\3"+
		"\6\3\7\3\7\5\7H\n\7\3\7\3\7\3\7\5\7M\n\7\6\7O\n\7\r\7\16\7P\3\b\3\b\3"+
		"\b\3\b\5\bW\n\b\3\b\3\b\3\b\3\b\7\b]\n\b\f\b\16\b`\13\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bh\n\b\3\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b\7\bt\n"+
		"\b\f\b\16\bw\13\b\3\b\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13\b\3\b\5\b"+
		"\u0083\n\b\3\b\3\b\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\b\5\b\u008f"+
		"\n\b\3\t\3\t\3\t\5\t\u0094\n\t\3\n\3\n\3\n\3\n\5\n\u009a\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a4\n\n\f\n\16\n\u00a7\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5\13\13"+
		"\3\13\3\13\3\f\3\f\3\f\7\f\u00bc\n\f\f\f\16\f\u00bf\13\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\5\r\u00ca\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\5\21\u00d8\n\21\3\21\3\21\3\21\2\2\22\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\4\2\30\30\32\32\3\2\22\25\2\u00e9"+
		"\2\"\3\2\2\2\4$\3\2\2\2\6\64\3\2\2\2\b\66\3\2\2\2\n=\3\2\2\2\fG\3\2\2"+
		"\2\16R\3\2\2\2\20\u0093\3\2\2\2\22\u0095\3\2\2\2\24\u00aa\3\2\2\2\26\u00b8"+
		"\3\2\2\2\30\u00c9\3\2\2\2\32\u00cb\3\2\2\2\34\u00cd\3\2\2\2\36\u00cf\3"+
		"\2\2\2 \u00d3\3\2\2\2\"#\5\4\3\2#\3\3\2\2\2$%\7\27\2\2%)\7\3\2\2&(\5\6"+
		"\4\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7"+
		"\4\2\2-\5\3\2\2\2.\65\5\b\5\2/\65\5\n\6\2\60\65\5\f\7\2\61\65\5\16\b\2"+
		"\62\65\5\20\t\2\63\65\5\30\r\2\64.\3\2\2\2\64/\3\2\2\2\64\60\3\2\2\2\64"+
		"\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\7\3\2\2\2\66\67\7\5\2\2\67"+
		";\7\26\2\289\7\27\2\29<\7\6\2\2:<\5\n\6\2;8\3\2\2\2;:\3\2\2\2<\t\3\2\2"+
		"\2=>\7\27\2\2>A\7\34\2\2?B\5\f\7\2@B\5\34\17\2A?\3\2\2\2A@\3\2\2\2BC\3"+
		"\2\2\2CD\7\6\2\2D\13\3\2\2\2EH\7\27\2\2FH\5\34\17\2GE\3\2\2\2GF\3\2\2"+
		"\2HN\3\2\2\2IL\5\32\16\2JM\7\27\2\2KM\5\34\17\2LJ\3\2\2\2LK\3\2\2\2MO"+
		"\3\2\2\2NI\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RS\7\7\2\2"+
		"SV\7\b\2\2TW\5\f\7\2UW\7\27\2\2VT\3\2\2\2VU\3\2\2\2WX\3\2\2\2XY\7\t\2"+
		"\2YZ\7\n\2\2Z^\7\3\2\2[]\5\6\4\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2"+
		"\2\2_a\3\2\2\2`^\3\2\2\2au\7\4\2\2bc\7\13\2\2cd\7\7\2\2dg\7\b\2\2eh\5"+
		"\f\7\2fh\7\27\2\2ge\3\2\2\2gf\3\2\2\2hi\3\2\2\2ij\7\t\2\2jk\7\n\2\2ko"+
		"\7\3\2\2ln\5\6\4\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2q"+
		"o\3\2\2\2rt\7\4\2\2sb\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\u0082\3\2"+
		"\2\2wu\3\2\2\2xy\7\13\2\2yz\7\n\2\2z~\7\3\2\2{}\5\6\4\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u0083\7\4\2\2\u0082x\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008e\3\2\2\2"+
		"\u0084\u0085\7\f\2\2\u0085\u0086\7\n\2\2\u0086\u008a\7\3\2\2\u0087\u0089"+
		"\5\6\4\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\7\4"+
		"\2\2\u008e\u0084\3\2\2\2\u008e\u008f\3\2\2\2\u008f\17\3\2\2\2\u0090\u0094"+
		"\5\22\n\2\u0091\u0094\5\24\13\2\u0092\u0094\5\26\f\2\u0093\u0090\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\21\3\2\2\2\u0095\u0096"+
		"\7\r\2\2\u0096\u0099\7\b\2\2\u0097\u009a\5\b\5\2\u0098\u009a\5\n\6\2\u0099"+
		"\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\7\6\2\2\u009c\u009d\5\f\7\2\u009d\u009e\7\6\2\2\u009e"+
		"\u009f\5\f\7\2\u009f\u00a0\7\t\2\2\u00a0\u00a1\7\16\2\2\u00a1\u00a5\7"+
		"\3\2\2\u00a2\u00a4\5\6\4\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a9\7\4\2\2\u00a9\23\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab\u00ac"+
		"\7\b\2\2\u00ac\u00ad\5\f\7\2\u00ad\u00ae\7\t\2\2\u00ae\u00af\7\16\2\2"+
		"\u00af\u00b3\7\3\2\2\u00b0\u00b2\5\6\4\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7\4\2\2\u00b7\25\3\2\2\2\u00b8\u00b9\7\16\2"+
		"\2\u00b9\u00bd\7\3\2\2\u00ba\u00bc\5\6\4\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\7\17\2\2\u00c2\u00c3\7"+
		"\b\2\2\u00c3\u00c4\5\f\7\2\u00c4\u00c5\7\t\2\2\u00c5\u00c6\7\6\2\2\u00c6"+
		"\27\3\2\2\2\u00c7\u00ca\5\36\20\2\u00c8\u00ca\5 \21\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00c8\3\2\2\2\u00ca\31\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc\33"+
		"\3\2\2\2\u00cd\u00ce\t\3\2\2\u00ce\35\3\2\2\2\u00cf\u00d0\7\20\2\2\u00d0"+
		"\u00d1\7\27\2\2\u00d1\u00d2\7\6\2\2\u00d2\37\3\2\2\2\u00d3\u00d7\7\21"+
		"\2\2\u00d4\u00d8\7\27\2\2\u00d5\u00d8\5\34\17\2\u00d6\u00d8\5\f\7\2\u00d7"+
		"\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\7\6\2\2\u00da!\3\2\2\2\31)\64;AGLPV^gou~\u0082\u008a"+
		"\u008e\u0093\u0099\u00a5\u00b3\u00bd\u00c9\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}