package exceptTask;

public class WordNoUse extends RuntimeException{
	public WordNoUse() {;}
	public WordNoUse(String input) {
		super(input);
	}
	
}
