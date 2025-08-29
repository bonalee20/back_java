package castingTask3;

public class User {
	String name;
	public User() {;}
	public User(String name) {
		super();
		this.name = name;
	}
	
	
	void kill(Charactor mon) {
		if(mon instanceof Fairy) {
			mon.hunt();
			mon.drop();
			((Fairy) mon).fairy(); // down
		}else if(mon instanceof Fairy) {
			mon.hunt();
			mon.drop();
		}
	}
}
