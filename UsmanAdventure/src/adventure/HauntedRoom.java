package adventure;

public class HauntedRoom extends Room {
	
	String[] questions ;
	String[] answers   ;
	String[] guess_ok  ;
	String[] guess_err ;
	
	public HauntedRoom(String description) {
		super(description);
	}
	
	public HauntedRoom(String description, String[] questions, String[] answers, String[] guess_ok, String[] guess_err) {
		super(description);
		
		this.answers    = answers    ;
		this.questions  = questions  ;
		this.guess_ok   = guess_ok   ; 
		this.guess_err  = guess_err  ; 
		
	}

	public String[] getQuestions() {
		
		return this.questions;
	}

	public String[] getAnswers() {
		
		return this.answers;
	}

	public String[] getGuessOk() {
		
		return this.guess_ok;
	}

	public String[] getGuessErr() {
		
		return this.guess_err;
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
