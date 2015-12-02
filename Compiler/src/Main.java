import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main {
	
	public static void main(String[] args) {
		String s = "";
		while (true)
		{
			  System.out.print("Start : \n");
			  
	          InputStreamReader isr = new InputStreamReader(System.in); 
	          BufferedReader br = new BufferedReader(isr);

	           try {
	                String line = null;
	                while (!(line = br.readLine()).equals("end")){

	                	s  = s +  line+ "\n" ; //// reading input Qupla Code from console line by line
	            }

		        }
		        catch(IOException e){
		            e.printStackTrace();
		        }
			
			try {
				ANTLRInputStream ais = new ANTLRInputStream(s);
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
			
			s = "";
			System.out.print("\n");
			
			SemanticListener.funcNames.clear(); // clear function Spageti for next usage
			SemanticListener.VarSpageti.clear(); // clear variable Spageti for next usage
		}
	}
	
}
