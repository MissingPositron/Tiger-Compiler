package translate;

import temp.*;

public abstract class Exp {
	///See p 140.
	
	//Ex stands for an "expression", represented as a tree.exp
	abstract tree.Exp unEx();
	
	//Nx stands for "no result", represented as a tree.stm
	abstract tree.Stm unNx();
	
	//Cx stands for "conditional", represented as a function from label-pair to statement.
	abstract tree.Stm unCx(Label t, Label f);
}
