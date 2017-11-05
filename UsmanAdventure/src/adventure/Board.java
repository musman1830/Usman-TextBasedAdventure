package adventure;

public class Board implements BoardI {
	
	HauntedRoom[] rooms;
	
	/**
	 * Creates game board [ 5 rooms ]
	 */
	public Board() {
		this(5);
	}
	
	public Board(int nbr_of_rooms) {
		rooms = new HauntedRoom[nbr_of_rooms];
	}
	
	public void print() {
		
		for (int i = 0; i < rooms.length; i++) {

			System.out.print("\n Room ["+ i +"] -> " + rooms[i].print() );
		}	
	}	
}
