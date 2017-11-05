package adventure;

public class Adventure {
	
	public static void main(String[] args)  {
		
		System.out.println("Welcome to my adventure game");
		
		// ***********************************************************
		// ROOM 1 questions 
		String[] room_1_q = new String[]{ "Do you really want to enter the house, not my fault if something happens to you?",  
										  "Alright, you are now in the sitting room. Would you like to enter room one and start your adventure?",
										  "If you ever feel like turning back and saving your life you can always say “Quit.” Just a heads up. But now that you in here, I think there is someone crying out straight up… Do you want to check?",
										  "Alright guess we will keep walking towards door 2. An old lady stops your path and asks for help, will you be a good person and help her?"
										  };
		
		String[] room_1_a = new String[]{ "yes",                         
										  "yes",
										  "no",
										  "no"
										  };
		
		String[] room_1_guess_ok  = new String[]{ "", "", "", ""};
		String[] room_1_guess_err = new String[]{ "", "", "", ""};
		
		
		// ***********************************************************
		// ROOM 2 questions 
		String[] room_2_q = new String[]{ "That was not so bad! But we still got 4 rooms to go through. Are you sure you don’t want to turn back?",  
										  "Watch that step! A black cat just crossed your path… Do you want to  keep walking straight to the door?",
										  "If you don’t want to go straight then you can either go to the right path or leftpath . Do you want to go right and then walk towards room 3?",
										  "Alright you turn left and now are walking towards the room 3. You hear a chain saw rumble, do you keep walking straight?",
										  "Do you want to take the right path now?",
										  };
		
		String[] room_2_a = new String[]{ "yes",                         
										  "no", 
										  "yes",
										  "no",
										  "yes",
										 };

		String[] room_2_guess_ok = new String[]{"",                         
										  		"", 
										  		"",
										  		"So I guess you should’ve went right instead",
										  		"Congratulation! You have chose the right path and now you made it to the door entering Room 3"
										 		};

		String[] room_2_guess_err = new String[]{ "",                         
										  		  "Wrong Answer: If says yes person dies because floor breaks and person falls into bottomless pit.", 
										  		  "",
										  		  "YOU have been killed by a serial killer with a chainsaw and you have lost the game!",
										  		  "YOU have been killed by a serial killer with a chainsaw and you have lost the game!"
										 		  };
		
		// ***********************************************************
		// ROOM 3 questions 
		String[] room_3_q = new String[]{ "MOST PEOPLE DON’T MAKE IT THIS FAR! ARE YOU SURE YOU WANT TO CONTINUE?",  
										  "You sure are brave. OOH Thats a lot of cash down there in the center of the room. I think its around a billion dollars, and no ones is near it. DO you want to go pick it up?", 
										  "Yea better safe than sorry! But I think  there might be another problem you should be worried about. There is a zombie behind you, Do you run towards room 4 or do you fight the zombie with that huge hammer on the floor?"	
											};
		
		String[] room_3_a = new String[]{ "yes",                         
										  "no",										  
										  "run",										  
										};
		
		String[] room_3_guess_ok = new String[]{"",                         
										  		"", 
										  		"Smart choice, you have made it to room 4."
										 		};

		String[] room_3_guess_err = new String[]{ "",                         
										  		  "You are picking up loads of this cash, but realize that this cash belonged to a Egyptian pharaoh whose body is in that coffin a little to right. WOAH He does not look too happy and – UR DEAD!", 
										  		  "Sorry Zombies just cant be defeated in a 1v1 so goodbye!"
				 		  						 };



		HauntedRoom room_1 = new HauntedRoom(	"HAUNTED ROOM 1"/*room description*/, 
												room_1_q/*room questions*/, 
												room_1_a/*room answers*/,
												room_1_guess_ok,
												room_1_guess_err);

		HauntedRoom room_2 = new HauntedRoom(	"HAUNTED ROOM 2"/*room description*/, 
												room_2_q/*room questions*/, 
												room_2_a/*room answers*/,
												room_2_guess_ok,
												room_2_guess_err);

		HauntedRoom room_3 = new HauntedRoom(	"HAUNTED ROOM 3"/*room description*/, 
												room_3_q/*room questions*/, 
												room_3_a/*room answers*/,
												room_3_guess_ok,
												room_3_guess_err);

		//HauntedRoom room_4 = new HauntedRoom(	"HAUNTED ROOM 4"/*room description*/, 
		//										room_4_q/*room questions*/, 
		//										room_4_a/*room answers*/,
		//										room_4_guess_ok,
		//										room_4_guess_err);

		//HauntedRoom room_5 = new HauntedRoom(	"HAUNTED ROOM 5"/*room description*/, 
		//										room_5_q/*room questions*/, 
		//										room_5_a/*room answers*/,
		//										room_5_guess_ok,
		//										room_5_guess_err);
		
		// build the place
		int number_of_rooms = 3;
		Place house = new Place( number_of_rooms );
		
		//System.out.println( house.prompt(" q1" ) );
		
		//if (true)
		//	return;
		
		house.addRoom( 1, room_1 ); 
		house.addRoom( 2, room_2 );
		house.addRoom( 3, room_3 );
	    //house.addRoom( 4, room_4 );
	    //house.addRoom( 5, room_5 );

	    //house.print(); // this print will call HauntedRoom.print() for each room
		house.navigate();
	
	}

}
