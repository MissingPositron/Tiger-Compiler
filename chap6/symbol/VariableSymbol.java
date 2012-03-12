package symbol;

import syntaxtree.*;

public class VariableSymbol extends Symbol {
	public Type t;
	
	public void dumpContents(int indent) {
		indent(indent);
		System.out.println(t + " " + id);		
	}
}
