package places;

public class HauntedRoom5 {

    public String toString()
    {
    	boolean[] doors = this.getDoors();
    	String response = "I heard many who made it this far didnt coem out alive. I think you should turn back."
    	+ " People have suffered many life changing after effects and are currently residents in that  Insane Asylum nearby. Will that be you too?"
    	+ " Do u really have what it takes to find that exit and escape! ** CHAINSAW sound is heard**";
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
