package adventure;

public class HauntedRoom extends Room {
	
	String[] questions;
	String[] answers;
	
	public HauntedRoom(String description) {
		super(description);
	}
	
	public HauntedRoom(String description, String[] questions, String[] answers) {
		super(description);
		
		this.answers   = answers   ;
		this.questions = questions ;
	}

	public void setQuestions(String[] questions) {
		
		this.questions = questions ;
	}

	public void setAnswers(String[] answers) {
		
		this.answers = answers;
	}

	// we need this ?!
	public void setCleared(boolean b) {
	}

	public String[] getQuestions() {
		
		return this.questions;
	}

	public String[] getAnswers() {
		
		return this.answers;
	}

	public boolean is_valid() {
		
		if ( 	(this.questions.length > 0 )
			&&	(this.answers.length   > 0 )
			&&  (this.answers.length == this.questions.length) ) {
			
			return true;
		
		} else {

			return false;
		}
	}
	
	public String print() {
		
		return " * Hunted room info: " + this.getDescription() + " q = " + this.questions.length + " a = " + this.answers.length;
	}
}
