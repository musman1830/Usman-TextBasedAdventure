package board;

import places.places;

public class board {


    private Room[][] DeathHouseMap;



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

