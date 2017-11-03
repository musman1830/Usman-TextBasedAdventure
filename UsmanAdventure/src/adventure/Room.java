package adventure;

public class Room {
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

	public String toString() {
		if(description == null) return "  XXX  ";
		return description;
	}
}
