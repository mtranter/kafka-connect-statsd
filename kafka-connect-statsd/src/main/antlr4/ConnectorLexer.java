// Generated from /home/mark/projects/judo/kafka-connect-statsd/kafka-connect-statsd/src/main/antlr4/ConnectorLexer.g4 by ANTLR 4.6

 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConnectorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEND=1, COUNT=2, OF=3, TO=4, FROM=5, WHERE=6, EQUALS=7, TOPICNAME=8, METRIC=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEND", "COUNT", "OF", "TO", "FROM", "WHERE", "EQUALS", "TOPICNAME", "METRIC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEND", "COUNT", "OF", "TO", "FROM", "WHERE", "EQUALS", "TOPICNAME", 
		"METRIC"
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


	public ConnectorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConnectorLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\5\5\5\66\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\t\6\tQ\n\t\r\t\16\tR\3\n\6\nV\n\n\r\n"+
		"\16\nW\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\4\7\2--/;C"+
		"\\aac|\6\2\60\60\62;C\\c|`\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3"+
		"\35\3\2\2\2\5)\3\2\2\2\7/\3\2\2\2\t\65\3\2\2\2\13?\3\2\2\2\rK\3\2\2\2"+
		"\17M\3\2\2\2\21P\3\2\2\2\23U\3\2\2\2\25\26\7u\2\2\26\27\7g\2\2\27\30\7"+
		"p\2\2\30\36\7f\2\2\31\32\7U\2\2\32\33\7G\2\2\33\34\7P\2\2\34\36\7F\2\2"+
		"\35\25\3\2\2\2\35\31\3\2\2\2\36\4\3\2\2\2\37 \7e\2\2 !\7q\2\2!\"\7w\2"+
		"\2\"#\7p\2\2#*\7v\2\2$%\7E\2\2%&\7Q\2\2&\'\7W\2\2\'(\7P\2\2(*\7V\2\2)"+
		"\37\3\2\2\2)$\3\2\2\2*\6\3\2\2\2+,\7q\2\2,\60\7h\2\2-.\7Q\2\2.\60\7H\2"+
		"\2/+\3\2\2\2/-\3\2\2\2\60\b\3\2\2\2\61\62\7v\2\2\62\66\7q\2\2\63\64\7"+
		"V\2\2\64\66\7Q\2\2\65\61\3\2\2\2\65\63\3\2\2\2\66\n\3\2\2\2\678\7h\2\2"+
		"89\7t\2\29:\7q\2\2:@\7o\2\2;<\7H\2\2<=\7T\2\2=>\7Q\2\2>@\7O\2\2?\67\3"+
		"\2\2\2?;\3\2\2\2@\f\3\2\2\2AB\7y\2\2BC\7j\2\2CD\7g\2\2DE\7t\2\2EL\7g\2"+
		"\2FG\7Y\2\2GH\7J\2\2HI\7G\2\2IJ\7T\2\2JL\7G\2\2KA\3\2\2\2KF\3\2\2\2L\16"+
		"\3\2\2\2MN\7?\2\2N\20\3\2\2\2OQ\t\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2"+
		"RS\3\2\2\2S\22\3\2\2\2TV\t\3\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2"+
		"\2X\24\3\2\2\2\13\2\35)/\65?KRW\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}