public class GRAPH {
	private VERTEX[] vertexArr;
	private char[][] matrix; 
	private Node[][] nodematrix;
	private int totalVertices;
	private STACK stack;
	private QUEUE queue;
	private int size;
	private int width;
	private int height;
	private int gravestones;
	private int portals;
	private Helper helper = new Helper();

	public GRAPH(int in_size) {
		this.size = in_size;
		this.width = in_size;
		this.height = in_size;
	}

	public GRAPH(int in_width, int in_height) {
		this.width = in_width;
		this.height = in_height;
		totalVertices = 0;
		vertexArr = new VERTEX[size];
		matrix = new char[width][height];
		resetMatrix();
	}

	public GRAPH(int in_width, int in_height, int in_gravestones, int in_portals) {
		this.width = in_width;
		this.height = in_height;
		this.gravestones = in_gravestones;
		this.portals = in_portals;
		matrix = new char[width][height];
		nodematrix = new Node[width][height];
		resetMatrix();
	}

	public void draw() {
		for (int i = 0; i < height; i++) {
			for (int k = 0; k < width; k++) {
				System.out.print(matrix[k][i]);
			}
			System.out.println();
		}

	}

	public void resetMatrix() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = 0;
			}
		}
	}

	public void addVertex(char inLabel) {
		vertexArr[totalVertices++] = new VERTEX(inLabel);
	}

	public void addEdge(int inSource, int inDest) {
		matrix[inSource][inDest] = 1;
		matrix[inDest][inSource] = 1;

	}

	public void drawVertex(int inVertex) {
		System.out.print(vertexArr[inVertex]);
	}

	public void breadthFS() {

	}

	public void DepthFS() {

	}

	public void addVertex(int x, int y) {

	}

	public void populate() {
		for (int i = 0; i < width; i++) {
			for (int k = 0; k < height; k++) {
				matrix[i][k] = 1;
				nodematrix[i][k] = new Node();
				}
			}
		
		matrix[0][0] = 'E';//entrance
		matrix[width-1][height-1] = 'X'; //EXit
	}
	
	public void addTombstone(int inX, int inY){
		matrix[inX][inY] = 'T';
	}

}
