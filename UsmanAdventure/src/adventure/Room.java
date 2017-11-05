package adventure;

public class Room implements RoomI {
	private String description;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Room(String s) {
		this.description = s;
	}
}
