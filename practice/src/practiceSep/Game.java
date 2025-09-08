package practiceSep;

class Monster{
	private String name;
	private String product;
	public Monster() {;}
	public Monster(String name, String product) {
		super();
		this.name = name;
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public void hunt() {
		System.out.println("dead");
	}
}
class Fairy2 extends Monster{
	public Fairy2() {;}
	@Override
	public void hunt() {
		System.out.println("fariy22 dead");
	}
}

class Fairy extends Monster{
	public Fairy() {;}
	@Override
	public void hunt() {
		System.out.println("fariy dead");
	}
}

class User{
	String userName;
	int age;
	public User() {;}
	public User(String userName, int age) {
		super();
		this.userName = userName;
		this.age = age;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void kill(Monster monster) {
		if(monster instanceof Fairy) {
			monster.hunt();
			Fairy f1 = (Fairy)monster;
		}
	}
	
}


public class Game {
	public static void main(String[] args) {
		new User().kill(new Fairy());
	}
}










