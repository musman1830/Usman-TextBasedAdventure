package adventure;

public class Adventure {
	
	public static void main(String[] args)  {
		
		System.out.println("Welcome to my adventure game");
		
		// ***********************************************************
		// ROOM 1 questions 
		String[] room_1_q = new String[]{ "Do you really want to enter the house, not my fault if something happens to you?",  
										  "Alright, you are now in the sitting room. Would you like to enter room one and start your adventure?",
										  "If you ever feel like turning back and saving your life you can always say �Quit.� Just a heads up. But now that you in here, I think there is someone crying out straight up� Do you want to check?",
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
		String[] room_2_q = new String[]{ "That was not so bad! But we still got 4 rooms to go through. Are you sure you don�t want to turn back?",  
										  "Watch that step! A black cat just crossed your path� Do you want to  keep walking straight to the door?",
										  "If you don�t want to go straight then you can either go to the right path or left path. So which path?",
										  "Alright you mixed up you left and rights so now you are walking left towards room 3. You hear a chain saw rumble, do you keep walking straight?",
										  "Do you want to take the right path now?",
										  };
		
		String[] room_2_a = new String[]{ "yes",                         
										  "no", 
										  "right",
										  "no",
										  "yes",
										 };

		String[] room_2_guess_ok = new String[]{"",                         
										  		"", 
										  		"",
										  		"So I guess you should�ve went right instead",
										  		"Congratulation! You have chose the right path and now you made it to the door entering Room 3"
										 		};

		String[] room_2_guess_err = new String[]{ "",                         
										  		  "You have died because the floor broke and you have fallen into a bottomless pit.", 
										  		  "",
										  		  "YOU got stabbed in the heart by a freddy!",
										  		  "YOU have been killed by the SAW!"
										 		  };
		
		// ***********************************************************
		// ROOM 3 questions 
		String[] room_3_q = new String[]{ "MOST PEOPLE DON�T MAKE IT THIS FAR! ARE YOU SURE YOU WANT TO CONTINUE?",  
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
										  		  "You are picking up loads of this cash, but realize that this cash belonged to a Egyptian pharaoh whose body is in that coffin a little to right. WOAH He does not look too happy and � UR DEAD!", 
										  		  "Sorry Zombies just cant be defeated in a 1v1 so goodbye!"
				 		  						 };
		//**************************************************************
		//Room 4 questions
		String[] room_4_q = new String[]{ "Alright Now that you are here in room 4, This is when it gets serious. There is a 5% chance you will survive. There are 3 ways to get to the final door, which is for room 5.\r\n" + 
				"\r\n" + 
				"You can either go North, West, North, or North, East, North or North, East South, East, North.\r\n" + 
				"Where do you want to go now?",  
				  						  "You are now walking north, and a doll is standing in your path. Do you want to kick it out of your way?", 
				  						  "Where do you want to go now?",
				  						  "Nothing looks wrong here except someone is following you QUICK WHERE DO YOU WANT TO GO?",
					};

		String[] room_4_a = new String[]{ "north",                         
				  "yes",										  
				  "east",
				  "north"
				};

		String[] room_4_guess_ok = new String[]{"",                         
				  		"Good choice, you can never trust those sh*ts", 
				  		"",
				  		"Congratualtion! You have made it to the final room, ROOM 5!"
				 		};

		String[] room_4_guess_err = new String[]{ "",                         
				  		  "Sorry the doll was possessed and has killed you first, you know what they say  “ Kill or get Killed.” ", 
				  		  "You have walked straight into Michael Myers and … I just want to tell you that you played great but not great enough, GOODBYE! ",
				  		  "Ugh who in the right mind would go to where the doll went flying towards. The doll has now sliced your head off."
 						 };
		//***************************************************************
		//Room 5 questions
		String[] room_5_q = new String[]{ "There is a Dancing Clown loose in this room. And there are only 2 ways to reach the exit."
										+" You can go either North West North West or North West North East. You will end up looking at a door either way so where do you want to go first.\r\n" + 
										 "If player says “Quit”  Player loses game.\r\n"  
										 ,  
										 "You are walking North. Where do you want to go now? Do you hear that giggle?! Its him, HURRY UP!", 
										 "You are walking WEST. Where do you want to go now? SOMEONE IT PULLING ON YOUR SHIRT Its him, HURRY UP!",
										 "You are walking North. You see two doors, one is on the east and the other on the west. "
										 + "Where do you want to go now? OMG the dancing CLOWN is about to devour you, hurry up!",
			};

		String[] room_5_a = new String[]{ "north",                         
		  "west",										  
		  "north",
		  "west"
		};

		String[] room_5_guess_ok = new String[]{ "",
												"",
												"",
												"",
												
		  		
		  		//"YES YOU DID IT. YOU HAVE SURVIVED THE CHALLENGE AND WON THE GAME!"
		 		};
		String[] room_5_guess_err = new String[]{  "",
				"",
				"",
				//"",
		  		  
		  		  "The killer clown was on the other side of the door and now has cut u up with a chainsaw! YOU WERE SO CLOSE SORRY! "
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

		HauntedRoom room_4 = new HauntedRoom(	"HAUNTED ROOM 4"/*room description*/, 
												room_4_q/*room questions*/, 
												room_4_a/*room answers*/,
												room_4_guess_ok,
												room_4_guess_err);

		HauntedRoom room_5 = new HauntedRoom(	"HAUNTED ROOM 5"/*room description*/, 
											room_5_q/*room questions*/, 
												room_5_a/*room answers*/,
												room_5_guess_ok,
												room_5_guess_err); 
		
	 	//build the place
		int number_of_rooms = 5;
		Place house = new Place( number_of_rooms );
		
		//System.out.println( house.prompt(" q1" ) );
		
		//if (true)
		//	return;
		
		house.addRoom( 1, room_1 ); 
		house.addRoom( 2, room_2 );
		house.addRoom( 3, room_3 );
	    house.addRoom( 4, room_4 );
	    house.addRoom( 5, room_5 );

	    house.print(); // this print will call HauntedRoom.print() for each room
		house.navigate();
	
	
	}
}
