
public class VERTEX {
	private char label;
	private boolean visited;
	
	public VERTEX(char inLabel){
		this.label = inLabel;
		visited = false;
	}
	
	public char getLabel(){
		return label;
	}
	
	public boolean visited(){
		return visited;
	}
	
	public void visit(){
		visited = true;
	}
	
	public void reset(){
		visited = false;
	}
	
}
