package places;

public class HauntedRoom2 {

    public String toString()
    {
    	boolean[] doors = this.getDoors();
    	String response = "Congratulations you have made it to room 2! You still got 3 rooms to go! Scared yet? ";
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

	private boolean[] getDoors() {
		// TODO Auto-generated method stub
		return null;
	}
}
