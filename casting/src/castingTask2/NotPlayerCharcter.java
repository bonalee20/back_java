package castingTask2;

public class NotPlayerCharcter {
	String name;
	public NotPlayerCharcter() {;}
	public NotPlayerCharcter(String name) {
		this.name = name;

	}

	void hunt() {
		System.out.println("사냥");
	}
	
	void drop () {
		System.out.println("얻음");;
	}
}
