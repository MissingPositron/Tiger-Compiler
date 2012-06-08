package frame;

import mips.LinkedList;
import temp.Temp;
import temp.Label;
import util.BoolList;

public abstract class Frame {
	public Label name;
	///This is a list of 'accesses' denoting the locations where formal parameters will be kept at run-time, as seen from inside the callee (p 128)
	public AccessList formals;
	abstract public Access allocLocal(boolean escape);
	///In mini-java, no parameters ever escape (see p 127)! Never create a BoolList with parameter h = true.
	///For each formal parameter, newFrame() must calculate 1) how the parameter will be seen from inside the function (in register or frame), and
	/// 2) what instructions must be produced to implement the view shift (p 128)
	abstract public Frame newFrame(Label name, BoolList formals);
	
    public abstract int wordSize();
    public abstract Temp framePointer();
    public abstract String tempMap(Temp temp);
}
