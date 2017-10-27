package board;

import places.places;

public class board {


    private Room[][] HospitalMap;



    public board(Room[][] HospitalMap)
    {
        this.HospitalMap = HospitalMap;
    }

    public void printMap()
    {


        for(Room[] row : HospitalMap)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
    public Room[][] getHospitalMap() {
        return HospitalMap;
    }

    public void setHospitalMap(Room[][] HospitalMap) {
        this.HospitalMap = HospitalMap;
    }


}

