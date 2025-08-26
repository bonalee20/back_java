package castingTask3;

public class Drama extends Video{
	public Drama() {;}

	public Drama(String name, int time) {
		super(name, time);
	}

	@Override
	void add() {
		System.out.println("굿즈");
	}
}
