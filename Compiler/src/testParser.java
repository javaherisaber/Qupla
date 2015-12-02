// Generated from test.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, P_OPEN=2, P_CLOSE=3, PLUS=4, CROSS=5, DIV=6, MINUS=7, MODULE=8, 
		POWER=9, LESS_THAN=10, GREATER_THAN=11, LESS_EQUAL=12, GREAT_EQUAL=13, 
		NOT_EQUAL=14, IS_EQUAL=15, AND=16, OR=17, NOT=18, XOR=19, FACTORIAL=20, 
		CONST_INT=21, CONST_REAL=22, CONST_HEX=23, QUES_MARK=24, COLON=25, COMMA=26, 
		NUM_SIGN=27, INTEGER=28, REAL=29, BOOL=30, WS=31, ENTER=32, TRUE=33, FALSE=34, 
		COMMENT=35, ID=36, SUBID=37;
	public static final int
		RULE_start = 0, RULE_exp = 1, RULE_major = 2, RULE_declarevar = 3, RULE_declarefunc = 4, 
		RULE_funcParams = 5, RULE_assignment = 6, RULE_print = 7, RULE_arithmetic = 8, 
		RULE_callfunc = 9, RULE_funcArgs = 10, RULE_stmt = 11, RULE_type = 12, 
		RULE_op = 13;
	public static final String[] ruleNames = {
		"start", "exp", "major", "declarevar", "declarefunc", "funcParams", "assignment", 
		"print", "arithmetic", "callfunc", "funcArgs", "stmt", "type", "op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<-'", "'('", "')'", "'+'", "'*'", "'/'", "'-'", "'%'", "'^'", 
		"'<'", "'>'", "'<='", "'>='", "'<>'", "'='", null, null, null, null, "'!'", 
		null, null, null, "'?'", "':'", "','", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ASSIGN", "P_OPEN", "P_CLOSE", "PLUS", "CROSS", "DIV", "MINUS", 
		"MODULE", "POWER", "LESS_THAN", "GREATER_THAN", "LESS_EQUAL", "GREAT_EQUAL", 
		"NOT_EQUAL", "IS_EQUAL", "AND", "OR", "NOT", "XOR", "FACTORIAL", "CONST_INT", 
		"CONST_REAL", "CONST_HEX", "QUES_MARK", "COLON", "COMMA", "NUM_SIGN", 
		"INTEGER", "REAL", "BOOL", "WS", "ENTER", "TRUE", "FALSE", "COMMENT", 
		"ID", "SUBID"
	};
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
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				exp();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_SIGN) | (1L << ENTER) | (1L << ID))) != 0) );
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
		public MajorContext major() {
			return getRuleContext(MajorContext.class,0);
		}
		public TerminalNode ENTER() { return getToken(testParser.ENTER, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			setState(37);
			switch (_input.LA(1)) {
			case NUM_SIGN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				major();
				setState(34);
				match(ENTER);
				}
				break;
			case ENTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(ENTER);
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

	public static class MajorContext extends ParserRuleContext {
		public DeclarevarContext declarevar() {
			return getRuleContext(DeclarevarContext.class,0);
		}
		public DeclarefuncContext declarefunc() {
			return getRuleContext(DeclarefuncContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public MajorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_major; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterMajor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitMajor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitMajor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MajorContext major() throws RecognitionException {
		MajorContext _localctx = new MajorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_major);
		try {
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				declarevar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				declarefunc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				print();
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

	public static class DeclarevarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode COLON() { return getToken(testParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarevarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarevar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDeclarevar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDeclarevar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDeclarevar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarevarContext declarevar() throws RecognitionException {
		DeclarevarContext _localctx = new DeclarevarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarevar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(ID);
			setState(46);
			match(COLON);
			setState(47);
			type();
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

	public static class DeclarefuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode P_OPEN() { return getToken(testParser.P_OPEN, 0); }
		public FuncParamsContext funcParams() {
			return getRuleContext(FuncParamsContext.class,0);
		}
		public TerminalNode P_CLOSE() { return getToken(testParser.P_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(testParser.COLON, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public DeclarefuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarefunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDeclarefunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDeclarefunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDeclarefunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarefuncContext declarefunc() throws RecognitionException {
		DeclarefuncContext _localctx = new DeclarefuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarefunc);
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(ID);
				setState(50);
				match(P_OPEN);
				setState(51);
				funcParams(0);
				setState(52);
				match(P_CLOSE);
				setState(53);
				match(COLON);
				setState(54);
				arithmetic(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(ID);
				setState(57);
				match(P_OPEN);
				setState(58);
				match(P_CLOSE);
				setState(59);
				match(COLON);
				setState(60);
				arithmetic(0);
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

	public static class FuncParamsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode COLON() { return getToken(testParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<FuncParamsContext> funcParams() {
			return getRuleContexts(FuncParamsContext.class);
		}
		public FuncParamsContext funcParams(int i) {
			return getRuleContext(FuncParamsContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(testParser.COMMA, 0); }
		public FuncParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFuncParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFuncParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitFuncParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamsContext funcParams() throws RecognitionException {
		return funcParams(0);
	}

	private FuncParamsContext funcParams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FuncParamsContext _localctx = new FuncParamsContext(_ctx, _parentState);
		FuncParamsContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_funcParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(64);
			match(ID);
			setState(65);
			match(COLON);
			setState(66);
			type();
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FuncParamsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_funcParams);
					setState(68);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(69);
					match(COMMA);
					setState(70);
					funcParams(3);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(testParser.ASSIGN, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			match(ASSIGN);
			setState(78);
			arithmetic(0);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode NUM_SIGN() { return getToken(testParser.NUM_SIGN, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(NUM_SIGN);
			setState(81);
			arithmetic(0);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(testParser.NOT, 0); }
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode P_OPEN() { return getToken(testParser.P_OPEN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode P_CLOSE() { return getToken(testParser.P_CLOSE, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public CallfuncContext callfunc() {
			return getRuleContext(CallfuncContext.class,0);
		}
		public TerminalNode QUES_MARK() { return getToken(testParser.QUES_MARK, 0); }
		public TerminalNode COLON() { return getToken(testParser.COLON, 0); }
		public TerminalNode FACTORIAL() { return getToken(testParser.FACTORIAL, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		return arithmetic(0);
	}

	private ArithmeticContext arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, _parentState);
		ArithmeticContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_arithmetic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(84);
				match(NOT);
				setState(85);
				arithmetic(7);
				}
				break;
			case 2:
				{
				setState(86);
				match(P_OPEN);
				setState(87);
				stmt();
				setState(88);
				match(P_CLOSE);
				setState(89);
				op();
				setState(90);
				arithmetic(4);
				}
				break;
			case 3:
				{
				setState(92);
				callfunc();
				}
				break;
			case 4:
				{
				setState(93);
				stmt();
				}
				break;
			case 5:
				{
				setState(94);
				match(P_OPEN);
				setState(95);
				arithmetic(0);
				setState(96);
				match(P_CLOSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(100);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(101);
						op();
						setState(102);
						arithmetic(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(104);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(105);
						match(QUES_MARK);
						setState(106);
						arithmetic(0);
						setState(107);
						match(COLON);
						setState(108);
						arithmetic(2);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(110);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(111);
						match(FACTORIAL);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(112);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(113);
						op();
						setState(114);
						match(P_OPEN);
						setState(115);
						stmt();
						setState(116);
						match(P_CLOSE);
						}
						break;
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CallfuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode P_OPEN() { return getToken(testParser.P_OPEN, 0); }
		public FuncArgsContext funcArgs() {
			return getRuleContext(FuncArgsContext.class,0);
		}
		public TerminalNode P_CLOSE() { return getToken(testParser.P_CLOSE, 0); }
		public CallfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCallfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCallfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCallfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallfuncContext callfunc() throws RecognitionException {
		CallfuncContext _localctx = new CallfuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callfunc);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(ID);
				setState(124);
				match(P_OPEN);
				setState(125);
				funcArgs(0);
				setState(126);
				match(P_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ID);
				setState(129);
				match(P_OPEN);
				setState(130);
				match(P_CLOSE);
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

	public static class FuncArgsContext extends ParserRuleContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public List<FuncArgsContext> funcArgs() {
			return getRuleContexts(FuncArgsContext.class);
		}
		public FuncArgsContext funcArgs(int i) {
			return getRuleContext(FuncArgsContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(testParser.COMMA, 0); }
		public FuncArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFuncArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFuncArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitFuncArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgsContext funcArgs() throws RecognitionException {
		return funcArgs(0);
	}

	private FuncArgsContext funcArgs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FuncArgsContext _localctx = new FuncArgsContext(_ctx, _parentState);
		FuncArgsContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_funcArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(134);
			arithmetic(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FuncArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_funcArgs);
					setState(136);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(137);
					match(COMMA);
					setState(138);
					funcArgs(3);
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode CONST_HEX() { return getToken(testParser.CONST_HEX, 0); }
		public TerminalNode CONST_INT() { return getToken(testParser.CONST_INT, 0); }
		public TerminalNode CONST_REAL() { return getToken(testParser.CONST_REAL, 0); }
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode TRUE() { return getToken(testParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(testParser.FALSE, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST_INT) | (1L << CONST_REAL) | (1L << CONST_HEX) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(testParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(testParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(testParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << REAL) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(testParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(testParser.MINUS, 0); }
		public TerminalNode CROSS() { return getToken(testParser.CROSS, 0); }
		public TerminalNode DIV() { return getToken(testParser.DIV, 0); }
		public TerminalNode POWER() { return getToken(testParser.POWER, 0); }
		public TerminalNode AND() { return getToken(testParser.AND, 0); }
		public TerminalNode OR() { return getToken(testParser.OR, 0); }
		public TerminalNode XOR() { return getToken(testParser.XOR, 0); }
		public TerminalNode MODULE() { return getToken(testParser.MODULE, 0); }
		public TerminalNode LESS_THAN() { return getToken(testParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(testParser.GREATER_THAN, 0); }
		public TerminalNode IS_EQUAL() { return getToken(testParser.IS_EQUAL, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(testParser.LESS_EQUAL, 0); }
		public TerminalNode GREAT_EQUAL() { return getToken(testParser.GREAT_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(testParser.NOT_EQUAL, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << CROSS) | (1L << DIV) | (1L << MINUS) | (1L << MODULE) | (1L << POWER) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_EQUAL) | (1L << GREAT_EQUAL) | (1L << NOT_EQUAL) | (1L << IS_EQUAL) | (1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return funcParams_sempred((FuncParamsContext)_localctx, predIndex);
		case 8:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
		case 10:
			return funcArgs_sempred((FuncArgsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean funcParams_sempred(FuncParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arithmetic_sempred(ArithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean funcArgs_sempred(FuncArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u0099\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3"+
		"\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ne\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\ny\n"+
		"\n\f\n\16\n|\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0086\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008e\n\f\f\f\16\f\u0091\13\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\2\5\f\22\26\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\5\5\2\27\31#$&&\3\2\36 \4\2\6\23\25\25\u009b\2\37\3\2\2\2\4\'"+
		"\3\2\2\2\6-\3\2\2\2\b/\3\2\2\2\n?\3\2\2\2\fA\3\2\2\2\16N\3\2\2\2\20R\3"+
		"\2\2\2\22d\3\2\2\2\24\u0085\3\2\2\2\26\u0087\3\2\2\2\30\u0092\3\2\2\2"+
		"\32\u0094\3\2\2\2\34\u0096\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2"+
		"!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#$\5\6\4\2$%\7\"\2\2%(\3\2\2\2&(\7"+
		"\"\2\2\'#\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2).\5\b\5\2*.\5\n\6\2+.\5\16\b\2"+
		",.\5\20\t\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\7\3\2\2\2/\60\7&"+
		"\2\2\60\61\7\33\2\2\61\62\5\32\16\2\62\t\3\2\2\2\63\64\7&\2\2\64\65\7"+
		"\4\2\2\65\66\5\f\7\2\66\67\7\5\2\2\678\7\33\2\289\5\22\n\29@\3\2\2\2:"+
		";\7&\2\2;<\7\4\2\2<=\7\5\2\2=>\7\33\2\2>@\5\22\n\2?\63\3\2\2\2?:\3\2\2"+
		"\2@\13\3\2\2\2AB\b\7\1\2BC\7&\2\2CD\7\33\2\2DE\5\32\16\2EK\3\2\2\2FG\f"+
		"\4\2\2GH\7\34\2\2HJ\5\f\7\5IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\r"+
		"\3\2\2\2MK\3\2\2\2NO\7&\2\2OP\7\3\2\2PQ\5\22\n\2Q\17\3\2\2\2RS\7\35\2"+
		"\2ST\5\22\n\2T\21\3\2\2\2UV\b\n\1\2VW\7\24\2\2We\5\22\n\tXY\7\4\2\2YZ"+
		"\5\30\r\2Z[\7\5\2\2[\\\5\34\17\2\\]\5\22\n\6]e\3\2\2\2^e\5\24\13\2_e\5"+
		"\30\r\2`a\7\4\2\2ab\5\22\n\2bc\7\5\2\2ce\3\2\2\2dU\3\2\2\2dX\3\2\2\2d"+
		"^\3\2\2\2d_\3\2\2\2d`\3\2\2\2ez\3\2\2\2fg\f\5\2\2gh\5\34\17\2hi\5\22\n"+
		"\6iy\3\2\2\2jk\f\3\2\2kl\7\32\2\2lm\5\22\n\2mn\7\33\2\2no\5\22\n\4oy\3"+
		"\2\2\2pq\f\13\2\2qy\7\26\2\2rs\f\7\2\2st\5\34\17\2tu\7\4\2\2uv\5\30\r"+
		"\2vw\7\5\2\2wy\3\2\2\2xf\3\2\2\2xj\3\2\2\2xp\3\2\2\2xr\3\2\2\2y|\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{\23\3\2\2\2|z\3\2\2\2}~\7&\2\2~\177\7\4\2\2\177"+
		"\u0080\5\26\f\2\u0080\u0081\7\5\2\2\u0081\u0086\3\2\2\2\u0082\u0083\7"+
		"&\2\2\u0083\u0084\7\4\2\2\u0084\u0086\7\5\2\2\u0085}\3\2\2\2\u0085\u0082"+
		"\3\2\2\2\u0086\25\3\2\2\2\u0087\u0088\b\f\1\2\u0088\u0089\5\22\n\2\u0089"+
		"\u008f\3\2\2\2\u008a\u008b\f\4\2\2\u008b\u008c\7\34\2\2\u008c\u008e\5"+
		"\26\f\5\u008d\u008a\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\27\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\t\2\2"+
		"\2\u0093\31\3\2\2\2\u0094\u0095\t\3\2\2\u0095\33\3\2\2\2\u0096\u0097\t"+
		"\4\2\2\u0097\35\3\2\2\2\f!\'-?Kdxz\u0085\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}