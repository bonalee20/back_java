package castingTask3;

public class Human extends Charactor{
	public Human() {;}

	@Override
	void hunt() {
		System.out.println("살인");
	}

	@Override
	void drop() {
		System.out.println("gold");
	}
	
	
}
