
public class QUEUE {
	
	private int mSize;
	private int[] queueArr;
	private int enqueue;
	private int dequeue;
	private int size;
	
	
	public QUEUE(int inSize){
		this.mSize = inSize;
		queueArr = new int[mSize];
		enqueue = 0;
		dequeue = 0;
		size = 0;
	}
	
	public void enqueue(int inInt){
		queueArr[enqueue++] = inInt;
		//enqueue++;
		size++;
		//if size = mSize array needs to be bigger
	}

	public int dequeue(){
		//int returnVal = dequeue;
		//	dequeue++;
		return queueArr[dequeue++];
	}
	
}
