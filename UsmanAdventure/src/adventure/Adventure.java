package adventure;

public class Adventure {
	
	public static void main(String[] args)  {
		
		System.out.println("Welcome to my adventure game");
		int number_of_rooms = 3;
		
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

		// ***********************************************************
		// ROOM 3 questions 
		String[] room_3_q = new String[]{ "MOST PEOPLE DON’T MAKE IT THIS FAR! ARE YOU SURE YOU WANT TO CONTINUE?",  
										  "You sure are brave. OOH Thats a lot of cash down there in the center of the room. I think its around a billion dollars, and no ones is near it. DO you want to go pick it up?", 
										  "Yea better safe than sorry! But I think  there might be another problem you should be worried about. There is a zombie behind you, Do you run towards room 4 or do you fight the zombie with that huge hammer on the floor?"	
											};
		
		String[] room_3_a = new String[]{ "yes",                         
										  "no",										  
										  "yes",										  
										};
		
		HauntedRoom room_1 = new HauntedRoom("HAUNTED ROOM 1"/*room description*/, room_1_q/*room questions*/, room_1_a/*room answers*/);
		//room_1.print(); // to print info for current room 

		HauntedRoom room_2 = new HauntedRoom("HAUNTED ROOM 2"/*room description*/, room_2_q/*room questions*/, room_2_a/*room answers*/);
		//room_2.print(); // to print info for current room 

		HauntedRoom room_3 = new HauntedRoom("HAUNTED ROOM 3"/*room description*/, room_3_q/*room questions*/, room_3_a/*room answers*/);
		//room_3.print(); // to print info for current room 
		
		Place house = new Place( number_of_rooms );
		
		house.addRoom( 1, room_1 );
		house.addRoom( 2, room_2 );
		house.addRoom( 3, room_3 );

	  //house.print(); // this print will call HauntedRoom.print() for each room
		house.navigate();
	
	}

}
