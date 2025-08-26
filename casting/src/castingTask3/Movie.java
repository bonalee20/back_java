package castingTask3;

public class Movie extends Video{
	public Movie() {;}
	public Movie(String name, int time) {
		super(name, time);
	}
	@Override
	void add() {
		System.out.println("4D");
	}
	
}
