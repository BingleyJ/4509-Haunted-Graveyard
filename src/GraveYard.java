
public class GraveYard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graveyard_size = 3;
		int graveyard_width = 4;
		int graveyard_height = 4;
		int tombstones = 2;
		int haunted_holes = 1;
		
		GRAPH graveyard = new GRAPH(graveyard_width,
				graveyard_height, tombstones, haunted_holes);
		
		graveyard.populate();
		graveyard.addTombstone(1, 1);
		
		graveyard.draw();
		//graveyard.addVertex('1');
		//graveyard.addEdge(0, 0);
		//graveyard.draw();
	}

}
