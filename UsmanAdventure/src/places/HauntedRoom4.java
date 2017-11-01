package places;

public class HauntedRoom4 {

    public String toString()
    {
    	boolean[] doors = this.getDoors();
    	String response = "Most people dont make it this far! But here in room 4, you will and I MEAN WILL face your worst nightmares! AHHH what was that sound!?!?! ";
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
