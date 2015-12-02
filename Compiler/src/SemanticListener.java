import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SemanticListener implements testListener {
	
	static ArrayList<ScopeManifest>    funcNames  = new ArrayList<ScopeManifest>(); // this holds function names
	static ArrayList<VariableManifest> VarSpageti = new ArrayList<VariableManifest>(); // this holds variable manifest
	
    String CurrentScope = "Global"; // our current scope in tree
    String CurrentFucName;
	
	public boolean VarFoundWithID(String varid,String scopeid)
	{
		int size = SemanticListener.VarSpageti.size();
		for (int i = size; i > 0; i--) 
		{	
			String resultId = SemanticListener.VarSpageti.get(i-1).varId;
			String resultScope = SemanticListener.VarSpageti.get(i-1).varScope.scopeId;
			if(resultId.equals(varid) && resultScope.equals(scopeid))
			{
				return true;
			}		
		}
		return false;
	}
	
	public boolean funcFoundWithID(String scopeid)
	{
		int size = SemanticListener.funcNames.size();
		for (int i = size ; i > 0 ; i--) 
		{	
			String result = SemanticListener.funcNames.get(i-1).scopeId;
			if(result.equals(scopeid))
			{
				return true;
			}		
		}
		return false;
	}
	
	public VariableManifest Lookupvar(String varid,String scopeid)
	{
		int size = SemanticListener.VarSpageti.size();
		for (int i = size; i > 0; i--) 
		{	
			VariableManifest vm = SemanticListener.VarSpageti.get(i-1);
			if(vm.varId.equals(varid) && vm.varScope.scopeId.equals(scopeid))
			{
				return vm;
			}		
		}
		return null;
	}
	
	public ScopeManifest Lookupfunc(String funcid)
	{
		int size = SemanticListener.funcNames.size();
		for (int i = size ; i > 0 ; i--) 
		{	
			ScopeManifest result = SemanticListener.funcNames.get(i-1);
			if(result.scopeId.equals(funcid))
			{
				return result;
			}		
		}
		return null;
	}
	public String GetTokenName(String input)
	{
		ANTLRInputStream ais = new ANTLRInputStream(input);
		testLexer lexer = new testLexer(ais);
		Token token = lexer.nextToken();
		String tokenName = testLexer.VOCABULARY.getSymbolicName(token.getType());
		return tokenName;
	}

	public String GetStmtType(ParseTree node)
	{
		String childTokenName = GetTokenName(node.getChild(0).getText());
		String childText = node.getChild(0).getText();
		if(childTokenName == "ID")
		{
			VariableManifest vm = Lookupvar(childText.toLowerCase(), CurrentScope.toLowerCase());
			if(vm == null)
			{
				vm = Lookupvar(childText.toLowerCase(), "Global".toLowerCase());
				if(vm == null)
				return "?";
				else
					return vm.varType;
			}
			else
			{
				return vm.varType;
			}
		}
		else if(childTokenName == "TRUE" || childTokenName == "FALSE")
		{
			return "bool";
		}
		else if(childTokenName == "CONST_INT" || childTokenName == "CONST_HEX")
		{
			return "integer";
		}
		else if(childTokenName == "CONST_REAL")
		{
			return "real";
		}
		return "?";
	}
	
	public String GetArithmeticType(ParseTree node)
	{
		String ReturnType = "?";
		int ChildCount = node.getChildCount();
		switch (ChildCount) {
		case 1:
			if(node.getChild(0).getClass().equals(testParser.StmtContext.class)) // child(0) is stmt
			{
				ReturnType = GetStmtType(node.getChild(0));
			}
			else // child(0) is callfunc
			{
				if(CurrentScope != "Global" && node.getChild(0).getChild(0).getText().equals(CurrentFucName))
				{
					System.out.println("cannot Recursively call a function with name << "+CurrentFucName+" >> in qupla");
					ReturnType = "?";
				}
				else
				{
					ScopeManifest returnfunc = Lookupfunc(node.getChild(0).getChild(0).getText());
					if(returnfunc == null)
						ReturnType = "?";
					else
						ReturnType = returnfunc.type;
				}
			}
			break;
		case 2:
			if(node.getChild(0).getText().toLowerCase().equals("not"))
			{
				String type = GetArithmeticType(node.getChild(1));
				if(type.equals("bool"))
					ReturnType = "bool";
				else if (type.equals("real")||type.equals("integer"))
				{
					System.out.println("Cannot NOT an operand with type ["+type+"]");
					ReturnType = "?";
				}
				else if(type.equals("?"))
				{
					System.out.println("Cannot NOT an operand with type ["+type+"]");
					ReturnType = "?";
				}
			}
			else if (node.getChild(1).getText().equals("!"))
			{
				String type = GetArithmeticType(node.getChild(0));
				if(type.equals("integer"))
					ReturnType = "integer";
				else if (type.equals("real")||type.equals("bool"))
				{
					System.out.println("Cannot Factorial an operand with type ["+type+"]");
					ReturnType = "?";
				}
				else if (type.equals("?"))
				{
					System.out.println("Cannot Factorial an operand with type ["+type+"]");
					ReturnType = "?";
				}
			}
			break;
		case 3:
			if(node.getChild(0).getText().equals("("))
			{
				String type = GetArithmeticType(node.getChild(1));
				ReturnType = type;
			}
			else if (node.getChild(0).getClass().equals(testParser.ArithmeticContext.class)) // arithmetic op arithmetic
			{
				String LeftSideType = GetArithmeticType(node.getChild(0));
				String RightSideType = GetArithmeticType(node.getChild(2));
				String OpToken = GetTokenName(node.getChild(1).getText());
				ReturnType = GetCompareType(LeftSideType, RightSideType, OpToken);
			}
			break;
		case 5:
			if(node.getChild(0).getText().equals("("))
			{
				String LeftSideType = GetStmtType(node.getChild(1));
				String RightSideType = GetArithmeticType(node.getChild(4));
				String OpToken = GetTokenName(node.getChild(3).getText());
				ReturnType = GetCompareType(LeftSideType, RightSideType, OpToken);
			}
			else if (node.getChild(1).getText().equals("?")) // this is for Conditional Expression
			{
				String firstClause = GetArithmeticType(node.getChild(0));
				if(!firstClause.equals("bool"))
				{
					System.out.println("cannot Perform Triple Expression with Condition of type ["+firstClause+"]");
				}

				String secondClause = GetArithmeticType(node.getChild(2));
				String thirdClause = GetArithmeticType(node.getChild(4));
				
				if ((secondClause.equals("integer") && thirdClause.equals("integer")) ||
					(secondClause.equals("real") && thirdClause.equals("real")) ||
					(secondClause.equals("bool") && thirdClause.equals("bool")) ||
					(secondClause.equals("real") && thirdClause.equals("integer")) ||
					(secondClause.equals("bool") && thirdClause.equals("real")) )
					ReturnType = secondClause;
	            else if ((secondClause.equals("integer") && thirdClause.equals("real")) ||
	            		 (secondClause.equals("integer") && thirdClause.equals("bool")) ||
	            		 (secondClause.equals("real") && thirdClause.equals("bool")) )
	                      ReturnType = thirdClause;
	            else {
	                    ReturnType = "?";
	                    System.out.println("MissMatch Types within Triple Expression on 2nd type [" + secondClause + "] and 3rd type [" + thirdClause +"]");
	                 }
				
			}
			else if (node.getChild(1).getClass().equals(testParser.OpContext.class))
			{
				String LeftSideType = GetArithmeticType(node.getChild(0));
				String RightSideType = GetStmtType(node.getChild(3));
				String OpToken = GetTokenName(node.getChild(1).getText());
				ReturnType = GetCompareType(LeftSideType, RightSideType, OpToken);
			}
			break;
		}
		return ReturnType;
	}
	
	public String GetCompareType(String Left,String Right,String op)
	{
		if(op.equals("AND")||op.equals("OR")||op.equals("XOR"))
		{
			if(Left.equals("bool")&&Right.equals("bool"))
				return "bool";
			else 
			{
				System.out.println("Cannot Perform op "+op+" on ["+Left+"] with ["+Right+"]");
				return "?";
			}
		}
		else if(op.equals("PLUS")||op.equals("MINUS")||op.equals("CROSS")||
				op.equals("DIV")||op.equals("POWER")||op.equals("MODULE"))
		{
			if(Left.equals("bool") || Right.equals("bool"))
			{
				System.out.println("Cannot Perform op "+op+" on ["+Left+"] with ["+Right+"]");
				return "?";
			}
			else if(Left.equals("integer") && Right.equals("integer"))
			{
				return "integer";
			}
			else if((Left.equals("real") && Right.equals("real"))||
					(Left.equals("real") && Right.equals("integer"))||
					(Left.equals("integer") && Right.equals("real")))
				return "real";
			else
			{
				System.out.println("Cannot Perform op "+op+" on ["+Left+"] with ["+Right+"]");
				return "?";
			}
		}
		else if (op.equals("LESS_THAN")||op.equals("GREATER_THAN")||op.equals("LESS_EQUAL")||
				op.equals("GREAT_EQUAL"))
		{
				if ((Left.equals("real") && Right.equals("real"))||
					(Left.equals("integer") && Right.equals("integer"))||
					(Left.equals("real") && Right.equals("integer"))||
					(Left.equals("integer") && Right.equals("real")))
				{
					return "bool";
				}
				else
				{
					System.out.println("Cannot Compare ["+Left+"] with ["+Right+"]");
					return "?";
				}
		}
		else if (op.equals("IS_EQUAL")||op.equals("NOT_EQUAL"))
		{
			if ((Left.equals("real") && Right.equals("real"))||
					(Left.equals("integer") && Right.equals("integer"))||
					(Left.equals("bool") && Right.equals("bool")))
				return "bool";
			else
			{
				System.out.println("Cannot Compare ["+Left+"] with ["+Right+"]");
				return "?";
			}
		}
		return "?";
	}
	
	@Override public void enterStart(testParser.StartContext ctx) { }
	@Override public void exitStart(testParser.StartContext ctx) { }
	@Override public void enterExp(testParser.ExpContext ctx) { }
	@Override public void exitExp(testParser.ExpContext ctx) { }
	@Override public void enterMajor(testParser.MajorContext ctx) { }
	@Override public void exitMajor(testParser.MajorContext ctx) { }
	
	@Override public void enterDeclarevar(testParser.DeclarevarContext ctx) { 
		try {
			if (ctx.getChildCount() == 3)
			{
				String varName = ctx.getChild(0).getText();
				String varType = ctx.getChild(2).getChild(0).getText();
				ScopeManifest sm = new ScopeManifest("Global","void");
				VariableManifest vm = new VariableManifest(varName, varType, sm);
				if(VarFoundWithID(vm.varId, vm.varScope.scopeId))
					System.out.println("Duplicate Variable Declaration with name << "+vm.varName+" >>"+" in Scope of { "+vm.varScope.scopeName+" }");
				SemanticListener.VarSpageti.add(vm);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override public void exitDeclarevar(testParser.DeclarevarContext ctx) { }
	
	@Override public void enterDeclarefunc(testParser.DeclarefuncContext ctx) { 
		try {
			if(ctx.getChildCount() == 5 || ctx.getChildCount() == 6)
			{
				String FuncName = ctx.getChild(0).getText();
				CurrentScope = FuncName.toLowerCase();
				CurrentFucName = FuncName.toLowerCase();
				ScopeManifest sm = new ScopeManifest(FuncName,"?");
				if(funcFoundWithID(sm.scopeId))
					System.out.println("Duplicate Function Declaration with name << "+sm.scopeName+" >>");
				funcNames.add(sm);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override public void exitDeclarefunc(testParser.DeclarefuncContext ctx) { 
		try {
			
			if(ctx.getChildCount() == 5 || ctx.getChildCount() == 6)
			{
				String FuncName = ctx.getChild(0).getText();
				String ReturnType;
				if(ctx.getChildCount() == 5)
					ReturnType = GetArithmeticType(ctx.getChild(4));
				else
					ReturnType = GetArithmeticType(ctx.getChild(5));
				ScopeManifest sm = new ScopeManifest(FuncName,ReturnType);
				int size = SemanticListener.funcNames.size();
				for (int i = size ; i > 0 ; i--) 
				{	
					ScopeManifest result = SemanticListener.funcNames.get(i-1);
					if(result.scopeId.equals(FuncName))
					{
						SemanticListener.funcNames.remove(i-1);
						break;
					}		
				}
				funcNames.add(sm);
			}
			CurrentScope = "Global";
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override public void enterFuncParams(testParser.FuncParamsContext ctx) { 
		
		try {
			if(ctx.getChildCount() == 3)
			{
				if(ctx.getChild(1).getText().equals(":"))
				{
					String varName = ctx.getChild(0).getText();
					String varType = ctx.getChild(2).getChild(0).getText();
					ScopeManifest sm = Lookupfunc(CurrentScope);
					VariableManifest vm = new VariableManifest(varName, varType, sm);
					if(VarFoundWithID(vm.varId, vm.varScope.scopeId))
						System.out.println("Duplicate Variable Declaration with name << "+vm.varName+" >>"+" in Scope of { "+vm.varScope.scopeName+" }");
					SemanticListener.VarSpageti.add(vm);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override public void exitFuncParams(testParser.FuncParamsContext ctx) { }

	@Override public void enterAssignment(testParser.AssignmentContext ctx) {
		try {
			if(ctx.getChildCount() == 3)
			{
				String varName = ctx.getChild(0).getText();
				if(!VarFoundWithID(varName.toLowerCase(), "Global".toLowerCase()))
					System.out.println("Missing variable declaration with name << "+varName+" >> in Scope of { "+"Global"+" }");
				VariableManifest vm = Lookupvar(varName.toLowerCase(), "Global".toLowerCase());
				String AssignLeftType;
				if(vm == null)
				{
					AssignLeftType = "?";
				}
				else
				{
					AssignLeftType = vm.varType;
				}
				String arithmeticType = GetArithmeticType(ctx.getChild(2));
				if(AssignLeftType.equals("bool") && (arithmeticType.equals("integer") || arithmeticType.equals("real")))
					System.out.println("Cannot Assign Type ["+arithmeticType+"] into Type ["+AssignLeftType+"]");
				else if(AssignLeftType.equals("integer") && (arithmeticType.equals("real") || arithmeticType.equals("bool")))
					System.out.println("Cannot Assign Type ["+arithmeticType+"] into Type ["+AssignLeftType+"] but can be Cast");
				else if(AssignLeftType.equals("real") &&(arithmeticType.equals("integer")|| arithmeticType.equals("bool")))
					System.out.println("Cannot Assign Type ["+arithmeticType+"] into Type ["+AssignLeftType+"] but can be Cast");
				else if(AssignLeftType.equals("?")||arithmeticType.equals("?"))
					System.out.println("Cannot Assign Type ["+arithmeticType+"] into Type ["+AssignLeftType+"]");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override public void exitAssignment(testParser.AssignmentContext ctx) { }
	
	@Override public void enterPrint(testParser.PrintContext ctx) {
		try {
			if(ctx.getChildCount() == 2)
			{
				@SuppressWarnings("unused")
				String type = GetArithmeticType(ctx.getChild(1));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
	@Override public void exitPrint(testParser.PrintContext ctx) { }
	
	@Override public void enterFuncArgs(testParser.FuncArgsContext ctx) {
		try {
			if(ctx.getChildCount() == 1)
			{
				@SuppressWarnings("unused")
				String type = GetArithmeticType(ctx.getChild(0));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override public void exitFuncArgs(testParser.FuncArgsContext ctx) { }
	@Override public void enterArithmetic(testParser.ArithmeticContext ctx) { }
	@Override public void exitArithmetic(testParser.ArithmeticContext ctx) { }
	@Override public void enterStmt(testParser.StmtContext ctx) { }
	@Override public void exitStmt(testParser.StmtContext ctx) { }
	@Override public void enterType(testParser.TypeContext ctx) { }
	@Override public void exitType(testParser.TypeContext ctx) { }
	@Override public void enterOp(testParser.OpContext ctx) { }
	@Override public void exitOp(testParser.OpContext ctx) { }
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }

	@Override public void visitTerminal(TerminalNode node) { 
		
		try {
			
			if(node.getSymbol().getType() == 36) // 36 is type of token ID
			{
				Class<? extends ParseTree> parentClass = node.getParent().getClass();
				ParseTree parent = node.getParent();
				boolean correct = true;
				if(parentClass.equals(testParser.DeclarevarContext.class)
						||parentClass.equals(testParser.FuncParamsContext.class)
						||parentClass.equals(testParser.DeclarefuncContext.class)
						||parentClass.equals(testParser.AssignmentContext.class)) // in this case we don't wanna check ID's that has been declared we just wanna check if an ID is exist or not
					correct = false;
				
				if(correct)
				{
					int count = parent.getChildCount();
					if(count == 1)//in this case parent of node is stmt
					{
						String varName = node.getText();
						if(!VarFoundWithID(varName.toLowerCase(), CurrentScope.toLowerCase()) && !VarFoundWithID(varName.toLowerCase(), "Global".toLowerCase()))
							System.out.println("Missing variable declaration with name << "+varName+" >> in Scope of { "+CurrentScope+" }");
					}
					else//in this case parent of node is except stmt
					{
						String funcName = node.getText();
						if(!funcFoundWithID(funcName.toLowerCase()))
							System.out.println("Missing Function Declaration with name << "+funcName+" >>");
					}
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override public void visitErrorNode(ErrorNode node) { }
	@Override public void enterCallfunc(testParser.CallfuncContext ctx) {	}
	@Override public void exitCallfunc(testParser.CallfuncContext ctx) { }
}