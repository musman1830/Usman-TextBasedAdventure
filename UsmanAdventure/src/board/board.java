package board;

import places.places;

public class board {


	public static final int SMALLBOARD = 5;
	public static final int MEDIUMBOARD = 7;
	public static final int LARGEBOARD = 10;
	
    private Room[][] rooms;
    private int boardSize = 0;
	private Room[][] DeathHouseMap;

    public void Board(int boardSizeInt) {

    	this.boardSize = boardSizeInt;
    	this.rooms = new Room[boardSize][boardSize];
       
    }

    public board(Room[][] DeathHouseMap)
    {
        this.DeathHouseMap = DeathHouseMap;
    }

    public void printMap()
    {


        for(Room[] row : DeathHouseMap)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
    public Room[][] DeathHouseMap() {
        return DeathHouseMap;
    }

    public void setDeathHouseMap(Room[][] DeathHouseMap) {
        this.DeathHouseMap = DeathHouseMap;
    }


}

