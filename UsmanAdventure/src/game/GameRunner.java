package game;

import items.Item;
import places.*;
import people.Person;

import java.util.Scanner;

import board.Room;

public class GameRunner {

    public static void main (String[] args)
    {
        Room[][] map = new Room[5][5];
        for (int j = 0; j<map.length; j++)
        {
        	Room[] row = map[j];
            for (int i = 0; i<row.length;i++)
            {
                boolean[] doors = {true,true,true,true};
                Person[] people = {};
                Item[] items = {};

                row[i] = new Room();
            }

        }

        Death house = new Death();


        boolean gameOn = true;
        Person player1 = Utilities.createPerson();
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Welcome to the Death House, " + player1.getFirstName());
            ((Room) map[0][0]).addOccupant(player1);

            ((Death) house).printMap();
            player1.printRoom();
            String move = player1.chooseMove();
            Utilities.movePlayer(house, player1,move);
            //gameOn = false;
            







        }
		in.close();
    }

}



