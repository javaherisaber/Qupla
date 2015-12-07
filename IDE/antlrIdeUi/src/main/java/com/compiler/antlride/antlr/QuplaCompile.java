package com.compiler.antlride.antlr;

import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.compiler.antlride.utils.ErrorInfo;

public class QuplaCompile {
	
	public static String inputCode ;
	public static ArrayList<ErrorInfo> errorlist = new ArrayList<ErrorInfo>();
	
	public QuplaCompile(String input_code)
	{
		inputCode = input_code;
	}
	
	public void CompileCode()
	{

		try {
				errorlist.clear();
				ANTLRInputStream ais = new ANTLRInputStream(inputCode);
				testLexer lexer = new testLexer(ais);
				lexer.removeErrorListeners();
				lexer.addErrorListener(new ErrorListenerLexer());
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				testParser parser = new testParser(tokens);
				parser.removeErrorListeners();
				parser.addErrorListener(new ErrorListenerParser());
				ParseTree ptree = parser.start();//start is first node in our rules
				ParseTreeWalker Walker = new ParseTreeWalker();
				Walker.walk(new SemanticListener(), ptree);
				
			} catch (RecognitionException e) {
			}
			
			SemanticListener.funcNames.clear(); // clear function Spageti for next usage
			SemanticListener.VarSpageti.clear(); // clear variable Spageti for next usage
	}
	
	public ArrayList<ErrorInfo> GetErrors()
	{
		return errorlist;
	}
}
