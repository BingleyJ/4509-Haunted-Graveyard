/*Stack Implementation 
 * 
 * Construct with maxsize
 * 
 * void push(x)      -> push x on stack
 * void pop(x)       -> take off top
 * void emptyStack() -> return true if empty
 * void fullStack()  -> return true if full
 * void peek()       -> return top of stack
 */

public class STACK {
	
	private int mSize;
	private int top;
	private int[] stackArr;
	
	public STACK(int inSize){
		this.mSize = inSize;
		stackArr = new int[mSize];
		this.top = -1;
	}
	
	public void push (int inPush){
		stackArr[++top] = inPush; //pre-increment operator
	}
	
	public int pop (){
		return (stackArr[top--]);//post increment operator
	}

	public boolean emptyStack(){
		if (top == -1)
			return true;
		else
			return false;
	}
	
	public int peek(){
		return stackArr[top];
	}

	public boolean fullStack(){
		if (top > -1)
			return true;
		else 
			return false;
	}
}
