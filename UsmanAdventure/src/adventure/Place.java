package adventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Place extends Board {
	
	
	
	/**
	 * Creates a 3,3 game board with 5 rooms
	 */
	public Place(int nbr_of_rooms) {
		
		super(nbr_of_rooms);
	}
	
	public boolean addRoom( int index, HauntedRoom room) {
		
		if ( (index > rooms.length) || ( index < 1 ) ) {
			
			System.out.println( "ERR: index out of range, expect range: [1 - " +  rooms.length +"]" );
			return false;
		}
		
		rooms[ index - 1 ] = room;
		return true;
	}

	public String prompt(String prompt) {
		
		System.out.println("\n" + prompt);
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			
			String s = sc.nextLine().trim().toLowerCase();
			if(s.equals("yes") || s.equals("no")) {
				return s;
			}
			else {
				System.out.println("Please enter yes or no");
			}
		}
		
		return null;
	}
	
	public boolean navigate() {
		
		for (int i = 0; i < rooms.length; i++) {
			
			HauntedRoom room = rooms[i];
			
			System.out.println("\nYou are entering " + room.getDescription());
			
			String[] questions = room.getQuestions();
			String[] answers   = room.getAnswers();
			
			for(int idx = 0; idx < questions.length; idx++) {
				
				String ans = prompt(questions[ idx ]);
				
				if ( !ans.equals("yes") && !ans.equals("no") ) {
					
					System.out.println("Sorry wrong answer you die");
					return false;
				}
				
				if ( !ans.equals( answers[idx] ) ) {
					
					System.out.println("Sorry wrong answer you die");
					return false;
				
				} 

				//System.out.println("Answer is correct, ..");
			}
		}
		
		System.out.println(" Game is over, .. congratulations !");
		return true;
	}
	
	//public boolean navigate() {
	//	for (int i = 0; i < rooms.length; i++) {
	//		for (int j = 0; j < rooms[i].length ; j++) {
	//			Room r =  rooms[i][j];
	//			if(r != null && r.getDescription() != null) {
	//				HauntedRoom room = (HauntedRoom)r;
	//				System.out.println("You are entering " + room.getDescription());
	//				String[] questions = room.getQuestions();
	//				String[] answers = room.getAnswers();
	//				for(int q = 0; q < questions.length; q++) {
	//					String ans = Adventure.prompt(questions[q]);
	//					if(ans.equals("yes") && answers[q].equals("no")) {
	//						System.out.println("Sorry wrong answer you die");
	//						return false;
	//					}
	//					if(ans.equals("no") && answers[q].equals("yes")) {
	//						System.out.println("Sorry wrong answer you die");
	//						return false;
	//					}
	//				}
	//				room.setCleared(true);
	//				print();
	//			}
	//		}
	//	}
	//	return true;
	//}
	
}
