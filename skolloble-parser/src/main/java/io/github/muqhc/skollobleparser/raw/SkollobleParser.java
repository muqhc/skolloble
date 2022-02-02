package io.github.muqhc.skollobleparser.raw;// Generated from Skolloble.g4 by ANTLR 4.9.3

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SkollobleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, Space=2, INTOATTR=3, NamespaceSign=4, ID=5, WholeWrap=6, SingleBlock=7, 
		NoBlock=8, GoOutBLOCK=9, INTOBLOCK=10, STRING=11, Comment=12;
	public static final int
		RULE_file = 0, RULE_element = 1, RULE_attribution = 2, RULE_block = 3, 
		RULE_attribute = 4, RULE_namespace = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "element", "attribution", "block", "attribute", "namespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "':'", "'@'", null, "'/'", "'-'", "'\\'", "'}'", "'{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "Space", "INTOATTR", "NamespaceSign", "ID", "WholeWrap", 
			"SingleBlock", "NoBlock", "GoOutBLOCK", "INTOBLOCK", "STRING", "Comment"
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
	public String getGrammarFileName() { return "Skolloble.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SkollobleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			element();
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SkollobleParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SkollobleParser.STRING, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		int _la;
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(ID);
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NamespaceSign) {
					{
					setState(15);
					namespace();
					}
				}

				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTOATTR) {
					{
					setState(18);
					attribution();
					}
				}

				setState(21);
				block();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(STRING);
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

	public static class AttributionContext extends ParserRuleContext {
		public TerminalNode INTOATTR() { return getToken(SkollobleParser.INTOATTR, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitAttribution(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attribution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(INTOATTR);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				attribute();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode INTOBLOCK() { return getToken(SkollobleParser.INTOBLOCK, 0); }
		public TerminalNode GoOutBLOCK() { return getToken(SkollobleParser.GoOutBLOCK, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode WholeWrap() { return getToken(SkollobleParser.WholeWrap, 0); }
		public TerminalNode SingleBlock() { return getToken(SkollobleParser.SingleBlock, 0); }
		public TerminalNode NoBlock() { return getToken(SkollobleParser.NoBlock, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			int _alt;
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTOBLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(INTOBLOCK);
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==STRING) {
					{
					{
					setState(32);
					element();
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(38);
				match(GoOutBLOCK);
				}
				break;
			case WholeWrap:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(WholeWrap);
				setState(41); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(40);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(43); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SingleBlock:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(SingleBlock);
				setState(46);
				element();
				}
				break;
			case NoBlock:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(NoBlock);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SkollobleParser.ID, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SkollobleParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ID);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSign) {
				{
				setState(51);
				namespace();
				}
			}

			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(54);
				match(STRING);
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NamespaceSign() { return getToken(SkollobleParser.NamespaceSign, 0); }
		public TerminalNode ID() { return getToken(SkollobleParser.ID, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(NamespaceSign);
			setState(58);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\5\3\23\n\3\3\3\5\3"+
		"\26\n\3\3\3\3\3\5\3\32\n\3\3\4\3\4\6\4\36\n\4\r\4\16\4\37\3\5\3\5\7\5"+
		"$\n\5\f\5\16\5\'\13\5\3\5\3\5\3\5\6\5,\n\5\r\5\16\5-\3\5\3\5\3\5\5\5\63"+
		"\n\5\3\6\3\6\5\6\67\n\6\3\6\5\6:\n\6\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f"+
		"\2\2\2C\2\16\3\2\2\2\4\31\3\2\2\2\6\33\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2"+
		"\2\f;\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\22\7\7\2\2\21\23\5\f\7\2\22"+
		"\21\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\25"+
		"\26\3\2\2\2\26\27\3\2\2\2\27\32\5\b\5\2\30\32\7\r\2\2\31\20\3\2\2\2\31"+
		"\30\3\2\2\2\32\5\3\2\2\2\33\35\7\5\2\2\34\36\5\n\6\2\35\34\3\2\2\2\36"+
		"\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \7\3\2\2\2!%\7\f\2\2\"$\5\4\3\2"+
		"#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(\63\7"+
		"\13\2\2)+\7\b\2\2*,\5\4\3\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63"+
		"\3\2\2\2/\60\7\t\2\2\60\63\5\4\3\2\61\63\7\n\2\2\62!\3\2\2\2\62)\3\2\2"+
		"\2\62/\3\2\2\2\62\61\3\2\2\2\63\t\3\2\2\2\64\66\7\7\2\2\65\67\5\f\7\2"+
		"\66\65\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28:\7\r\2\298\3\2\2\29:\3\2\2\2"+
		":\13\3\2\2\2;<\7\6\2\2<=\7\7\2\2=\r\3\2\2\2\13\22\25\31\37%-\62\669";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}