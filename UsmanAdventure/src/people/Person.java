package people;


public class Person {
	
	private String firstName;
	private String lastName;
	
	private Person[] friends;
	private String nickname;
	private String Borough;
	
	public Person(String first, String last, Borough home) {
		this.lastName = last;
		this.firstName = first;
		this.setHome(home);
		
		
		
	}
	
	private void setHome(people.Borough home) {
		// TODO Auto-generated method stub
		
	}

	public static String createNickname(String name) {
		String nickname = "";
		int timesVow = 0;
		int pos2Vow = 0;
		for(int i = 0; i < name.length()-1; i++) {
			if(isVowel(name.substring(i,i+1))) {
				timesVow++;
			}
			if(timesVow == 2) {
				pos2Vow = i;
			}
		}
		if(timesVow == 1) {
			return name;
		}
		else
		{
			nickname = name.substring(0,pos2Vow);
		}
		return nickname;
	}
	public static boolean isVowel(String p) {
		if(p.equalsIgnoreCase("a") 
			|| p.equalsIgnoreCase("e")
			|| p.equalsIgnoreCase("i")
			|| p.equalsIgnoreCase("o")
			|| p.equalsIgnoreCase("u")) {
			return true;
		}
		return false;
	}
	

	public String toString() {
		return "My name is "+firstName+ " " + lastName+ ". Call me "+nickname+".";
	}

	public String setFirstName(String string) {
		this.firstName = string;
		return firstName;
	}

	public void printRoom() {
		// TODO Auto-generated method stub
		
	}

	public String chooseMove() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
