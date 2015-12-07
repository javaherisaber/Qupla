package com.compiler.antlride.antlr;
// Generated from test.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ASSIGN", "P_OPEN", "P_CLOSE", "PLUS", "CROSS", "DIV", "MINUS", "MODULE", 
		"POWER", "LESS_THAN", "GREATER_THAN", "LESS_EQUAL", "GREAT_EQUAL", "NOT_EQUAL", 
		"IS_EQUAL", "AND", "OR", "NOT", "XOR", "FACTORIAL", "CONST_INT", "CONST_REAL", 
		"CONST_HEX", "QUES_MARK", "COLON", "COMMA", "NUM_SIGN", "INTEGER", "REAL", 
		"BOOL", "WS", "ENTER", "TRUE", "FALSE", "COMMENT", "ID", "SUBID"
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u013c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\6\26\u0082"+
		"\n\26\r\26\16\26\u0083\3\27\7\27\u0087\n\27\f\27\16\27\u008a\13\27\3\27"+
		"\3\27\6\27\u008e\n\27\r\27\16\27\u008f\3\30\3\30\3\30\6\30\u0095\n\30"+
		"\r\30\16\30\u0096\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3 \6 \u00b4\n \r \16 \u00b5\3 \3 \3!\5!\u00bb\n!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\7$\u00d1\n$\f$\16"+
		"$\u00d4\13$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00fa\n%\5%\u00fc"+
		"\n%\5%\u00fe\n%\5%\u0100\n%\5%\u0102\n%\5%\u0104\n%\5%\u0106\n%\5%\u0108"+
		"\n%\5%\u010a\n%\5%\u010c\n%\5%\u010e\n%\5%\u0110\n%\5%\u0112\n%\5%\u0114"+
		"\n%\5%\u0116\n%\5%\u0118\n%\5%\u011a\n%\5%\u011c\n%\5%\u011e\n%\5%\u0120"+
		"\n%\5%\u0122\n%\5%\u0124\n%\5%\u0126\n%\5%\u0128\n%\5%\u012a\n%\5%\u012c"+
		"\n%\5%\u012e\n%\5%\u0130\n%\5%\u0132\n%\5%\u0134\n%\5%\u0136\n%\5%\u0138"+
		"\n%\3&\5&\u013b\n&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\30\4\2CCcc\4\2PPpp\4\2F"+
		"Fff\4\2QQqq\4\2TTtt\4\2VVvv\4\2ZZzz\3\2\62;\5\2\62;CHch\4\2KKkk\4\2GG"+
		"gg\4\2IIii\4\2NNnn\4\2DDdd\6\2\n\13\17\17\"\"tt\4\2WWww\4\2HHhh\4\2UU"+
		"uu\5\2\62;C\\c|\b\2#(*\61<B]]_b}\177\4\2))^^\4\2C\\c|\u0166\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\3M\3\2\2\2\5P\3\2\2\2\7R\3\2\2\2\tT\3\2\2\2\13V\3\2\2\2"+
		"\rX\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23^\3\2\2\2\25`\3\2\2\2\27b\3\2\2"+
		"\2\31d\3\2\2\2\33g\3\2\2\2\35j\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#s\3\2\2\2"+
		"%v\3\2\2\2\'z\3\2\2\2)~\3\2\2\2+\u0081\3\2\2\2-\u0088\3\2\2\2/\u0091\3"+
		"\2\2\2\61\u0098\3\2\2\2\63\u009a\3\2\2\2\65\u009c\3\2\2\2\67\u009e\3\2"+
		"\2\29\u00a0\3\2\2\2;\u00a8\3\2\2\2=\u00ad\3\2\2\2?\u00b3\3\2\2\2A\u00ba"+
		"\3\2\2\2C\u00be\3\2\2\2E\u00c3\3\2\2\2G\u00c9\3\2\2\2I\u00d9\3\2\2\2K"+
		"\u013a\3\2\2\2MN\7>\2\2NO\7/\2\2O\4\3\2\2\2PQ\7*\2\2Q\6\3\2\2\2RS\7+\2"+
		"\2S\b\3\2\2\2TU\7-\2\2U\n\3\2\2\2VW\7,\2\2W\f\3\2\2\2XY\7\61\2\2Y\16\3"+
		"\2\2\2Z[\7/\2\2[\20\3\2\2\2\\]\7\'\2\2]\22\3\2\2\2^_\7`\2\2_\24\3\2\2"+
		"\2`a\7>\2\2a\26\3\2\2\2bc\7@\2\2c\30\3\2\2\2de\7>\2\2ef\7?\2\2f\32\3\2"+
		"\2\2gh\7@\2\2hi\7?\2\2i\34\3\2\2\2jk\7>\2\2kl\7@\2\2l\36\3\2\2\2mn\7?"+
		"\2\2n \3\2\2\2op\t\2\2\2pq\t\3\2\2qr\t\4\2\2r\"\3\2\2\2st\t\5\2\2tu\t"+
		"\6\2\2u$\3\2\2\2vw\t\3\2\2wx\t\5\2\2xy\t\7\2\2y&\3\2\2\2z{\t\b\2\2{|\t"+
		"\5\2\2|}\t\6\2\2}(\3\2\2\2~\177\7#\2\2\177*\3\2\2\2\u0080\u0082\4\62;"+
		"\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084,\3\2\2\2\u0085\u0087\t\t\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u008d\7\60\2\2\u008c\u008e\t\t\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090.\3\2\2\2\u0091\u0092\7\62\2\2\u0092\u0094\t\b\2\2\u0093\u0095"+
		"\t\n\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\60\3\2\2\2\u0098\u0099\7A\2\2\u0099\62\3\2\2\2\u009a"+
		"\u009b\7<\2\2\u009b\64\3\2\2\2\u009c\u009d\7.\2\2\u009d\66\3\2\2\2\u009e"+
		"\u009f\7%\2\2\u009f8\3\2\2\2\u00a0\u00a1\t\13\2\2\u00a1\u00a2\t\3\2\2"+
		"\u00a2\u00a3\t\7\2\2\u00a3\u00a4\t\f\2\2\u00a4\u00a5\t\r\2\2\u00a5\u00a6"+
		"\t\f\2\2\u00a6\u00a7\t\6\2\2\u00a7:\3\2\2\2\u00a8\u00a9\t\6\2\2\u00a9"+
		"\u00aa\t\f\2\2\u00aa\u00ab\t\2\2\2\u00ab\u00ac\t\16\2\2\u00ac<\3\2\2\2"+
		"\u00ad\u00ae\t\17\2\2\u00ae\u00af\t\5\2\2\u00af\u00b0\t\5\2\2\u00b0\u00b1"+
		"\t\16\2\2\u00b1>\3\2\2\2\u00b2\u00b4\t\20\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\b \2\2\u00b8@\3\2\2\2\u00b9\u00bb\7\17\2\2\u00ba\u00b9"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\f\2\2\u00bd"+
		"B\3\2\2\2\u00be\u00bf\t\7\2\2\u00bf\u00c0\t\6\2\2\u00c0\u00c1\t\21\2\2"+
		"\u00c1\u00c2\t\f\2\2\u00c2D\3\2\2\2\u00c3\u00c4\t\22\2\2\u00c4\u00c5\t"+
		"\2\2\2\u00c5\u00c6\t\16\2\2\u00c6\u00c7\t\23\2\2\u00c7\u00c8\t\f\2\2\u00c8"+
		"F\3\2\2\2\u00c9\u00d2\7\u0080\2\2\u00ca\u00d1\t\24\2\2\u00cb\u00d1\5A"+
		"!\2\u00cc\u00d1\5? \2\u00cd\u00d1\t\25\2\2\u00cf\u00d1\t\26\2\2\u00d0"+
		"\u00ca\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d6\7\u0080\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b$\2\2\u00d8"+
		"H\3\2\2\2\u00d9\u0137\t\27\2\2\u00da\u0135\5K&\2\u00db\u0133\5K&\2\u00dc"+
		"\u0131\5K&\2\u00dd\u012f\5K&\2\u00de\u012d\5K&\2\u00df\u012b\5K&\2\u00e0"+
		"\u0129\5K&\2\u00e1\u0127\5K&\2\u00e2\u0125\5K&\2\u00e3\u0123\5K&\2\u00e4"+
		"\u0121\5K&\2\u00e5\u011f\5K&\2\u00e6\u011d\5K&\2\u00e7\u011b\5K&\2\u00e8"+
		"\u0119\5K&\2\u00e9\u0117\5K&\2\u00ea\u0115\5K&\2\u00eb\u0113\5K&\2\u00ec"+
		"\u0111\5K&\2\u00ed\u010f\5K&\2\u00ee\u010d\5K&\2\u00ef\u010b\5K&\2\u00f0"+
		"\u0109\5K&\2\u00f1\u0107\5K&\2\u00f2\u0105\5K&\2\u00f3\u0103\5K&\2\u00f4"+
		"\u0101\5K&\2\u00f5\u00ff\5K&\2\u00f6\u00fd\5K&\2\u00f7\u00fb\5K&\2\u00f8"+
		"\u00fa\5K&\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00f7"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f6\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00f5\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u00f4\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u00f3\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u00f2\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u00f1\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u00f0\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u00ef\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u00ee\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0112\3\2\2\2\u0111\u00ed\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u00ec\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2"+
		"\2\2\u0115\u00eb\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u00ea\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u00e9\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u00e8\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u00e7\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u0120\3\2\2\2\u011f\u00e6\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0122\3\2\2\2\u0121\u00e5\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2"+
		"\2\2\u0123\u00e4\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u00e3\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u00e2\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u00e1\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u00e0\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012e\3\2\2\2\u012d\u00df\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\3\2\2\2\u012f\u00de\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u00dd\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u00dc\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u00db\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u00da\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138J\3\2\2\2\u0139\u013b\t\24\2\2\u013a\u0139\3\2\2\2"+
		"\u013bL\3\2\2\2,\2\u0083\u0088\u008f\u0096\u00b5\u00ba\u00d0\u00d2\u00f9"+
		"\u00fb\u00fd\u00ff\u0101\u0103\u0105\u0107\u0109\u010b\u010d\u010f\u0111"+
		"\u0113\u0115\u0117\u0119\u011b\u011d\u011f\u0121\u0123\u0125\u0127\u0129"+
		"\u012b\u012d\u012f\u0131\u0133\u0135\u0137\u013a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}