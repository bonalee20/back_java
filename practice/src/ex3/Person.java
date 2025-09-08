package ex3;
//**부모 클래스 Person**을 만든다.

//name, age, job, hobby를 private 필드로 두고, 기본/초기화 생성자, getter/setter, 
//printName/printWork/printHobby 메서드를 제공한다.


public class Person {
	private String name;
	private int age;
	private String hobby;
	
	public Person() {;}

	public Person(String name, int age, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	//printName/printWork/printHobby 메서드를 제공한다.
	public void printName() {
		System.out.println(getName());
	}

	
	public void printWork() {
		System.out.println(getName());
	}

	public void printHobby(String hobby) {
		System.out.printf("취미는 %s입니다.",hobby);
	}
	
	
	
}
