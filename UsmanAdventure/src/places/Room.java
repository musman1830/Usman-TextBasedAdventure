package places;

public class Room {

	

	public void addOccupant(Person player1) {
		// TODO Auto-generated method stub
		
	}
	package rooms;

	import people.Person;
	import items.Item;


	public class HauntedRoom1 extends Room {

	    public HauntedRoom1(boolean[] doors, Person[] people, Item[] items, int x, int y)
	    {
	        super(doors, people, items, x, y);
	    }

	    public void print()
	    {
	        if (getOccupants().length != 0)
	        {
	            System.out.print(getOccupants()[0].print());
	        }
	        else if (this.explored)
	        {
	            System.out.print("[ H ]");
	        }
	        else
	        {
	            System.out.print("[   ]");
	        }

	    }
	    
	    public String toString()
	    {
	    	boolean[] doors = this.getDoors();
	    	String response = "This room is a hallway. It has doors to the ";
	    	if (doors[0])
	    	{
	    		response += "N";
	    	}
	    	
	    	if(doors[1]) {
	    		response += " and E";
	    	}
	    	
	    	if (doors[2]) {
	    		response += " and S";
	    	}
	    	
	    	if (doors[3]) {
	    		response += " and W";
	    	}
	    	
	    	return response;
	    }
	}

}
