package places;

public class HauntedRoom3 {

    public String toString()
    {
    	boolean[] doors = this.getDoors();
    	String response = "MUHAHAHAHAAH! Really think you should turn back because there are a couple loose serial killers in this room... WATCHOUT! ";
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
