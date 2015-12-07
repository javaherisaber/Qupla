package com.compiler.antlride.antlr;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import com.compiler.antlride.utils.ErrorInfo;

public class ErrorListenerLexer extends BaseErrorListener {
		@Override
		public void syntaxError(Recognizer<?, ?> recognizer,
		Object offendingSymbol,
		int line, int charPositionInLine,
		String msg,
		RecognitionException e)
		{
			String Content = ("line "+line+":"+charPositionInLine+" "+msg);
			ErrorInfo ei = new ErrorInfo("Lexical","ic_alphabet",Content,line);
			QuplaCompile.errorlist.add(ei);
		}
}