package adventure;

public class Board {
	
  //HauntedRoom current; // this is used ?!
	HauntedRoom[] rooms;
	
	/**
	 * Creates game board that's 5x5
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
