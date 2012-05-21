package visitor;

import java.util.*;
import syntaxtree.*;
import symbol.SymbolTable;

public class MIPSTranslator extends DepthFirstVisitor {
	public SymbolTable symbolTable;
	
	public MIPSTranslator(SymbolTable st) {
		symbolTable = st;
	}
	
	/*Methods for generating assembly code*/
	public void emit() {
		//TODO: write this...
		
		//should be tab indented
	}
	
	public void emitLabel() {
		//TODO: write this...
		
		//Labels are non-indented and should be followed by a colon
	}
	/**/
	
	
  public void visit(Program n) {}
  public void visit(MainClass n){}
  public void visit(ClassDeclSimple n){}
  public void visit(ClassDeclExtends n){}
  public void visit(VarDecl n) {}
  public void visit(MethodDecl n) {}
  public void visit(Formal n) {}
  public void visit(IntArrayType n) {}
  public void visit(BooleanType n) {}
  public void visit(IntegerType n) {}
  public void visit(IdentifierType n) {}
  public void visit(Block n) {}
  public void visit(If n) {}
  public void visit(While n) {}
  public void visit(Print n) {
	  //Print:  Assume that the expression to be printed is of type integer.  
	  //(Add such a restriction in your type-checking phase.)  Generate the expression code. 
	  //From the previous assumptions, the integer value of this expression is in $v0 after this code's execution.  
	  //Print this integer and follow it with a newline.  You can now test the correct compilation of Print0.java.	  
  }
  public void visit(Assign n) {}
  public void visit(ArrayAssign n) {}
  public void visit(And n) {}
  public void visit(LessThan n) {}
  public void visit(Plus n) {}
  public void visit(Minus n) {}
  public void visit(Times n) {}
  public void visit(ArrayLookup n) {}
  public void visit(ArrayLength n) {}
  public void visit(Call n) {}
  public void visit(IntegerLiteral n) {
	  //IntegerLiteral:  For all expressions, assume that the result of the expression will always be placed in register $v0.  
	  //Thus the code generated from IntegerLiteral will load the given immediate value into $v0.	  
  }
  public void visit(True n) {}
  public void visit(False n) {}
  public void visit(IdentifierExp n) {}
  public void visit(This n) {}
  public void visit(NewArray n) {}
  public void visit(NewObject n) {}
  public void visit(Not n) {}
  public void visit(Identifier n) {}	
}
