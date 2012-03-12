package symbol;

public abstract class Symbol {
	String type;
	String id;
	
	public String getId() {
		return id;
	}
	
	public abstract void dumpContents(int indent);
	
	public void indent(int numLevels) {
		for (int i = 0; i < numLevels; i++) {
			System.out.print("\t");
		}
	}
}
