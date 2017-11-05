package adventure;

import java.util.Scanner;

public class Place extends Board {
	
	/**
	 * Creates a game board with nbr_of_rooms rooms
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

		// This code for user to response yes, no 
		while(sc.hasNextLine()) {
			
			String s = sc.nextLine().trim().toLowerCase();
			//if(s.equals("yes") || s.equals("no")) {
				return s;
			//}
			//else {
			//	System.out.println("Please enter yes or no");
			//}
		}

		return null;
	}
	
	public boolean navigate() {
		
		for (int i = 0; i < rooms.length; i++) {
			
			HauntedRoom room = rooms[i];
			
			System.out.println("\nYou are entering " + room.getDescription());
			
			String[] questions = room.getQuestions();
			String[] answers   = room.getAnswers();
			String[] guess_ok  = room.getGuessOk();
			String[] guess_err = room.getGuessErr();
			
			for(int idx = 0; idx < questions.length; idx++) {
				
				String ans = prompt(questions[ idx ]);
				
				//System.out.println("Your answer ["+ans+"]");
				
				// check if user choose to quit
				if ( ans.equals("quit") ) {
					
					System.out.println("You choose to quit, .. bye !");
					return false;
				}
				
				//if ( !ans.equals("yes") && !ans.equals("no") ) {
				//	
				//	System.out.println("Sorry wrong answer you die");
				//	return false;
				//}
				
				if ( ans.equals( answers[idx] ) ) {

					if ( guess_ok[idx].length() > 0 )
						System.out.println( guess_ok[idx] );

				} else {
					
					if ( guess_err[idx].length() > 0 )
						System.out.println( guess_err[idx] );
					else
						System.out.println("Sorry wrong answer you die");
					
					return false;				
				} 

				//System.out.println("Answer is correct, ..");
			}
		}
		
		System.out.println(" Game is over, .. congratulations !");
		return true;
	}

}
