package ex3;
//**자식 클래스 Student**를 만든다.
//Person을 상속받고, number(학번 등) 필드를 추가한다.
//printName, printWork를 오버라이딩한다.

import java.util.Random;

public class Student extends Person{
	private int number;
	public Student() {;}
	public Student(int number) {
		super();
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public void printName() {
		System.out.println(getName()+"환영합니다.");
	}
	
	@Override
	public void printHobby(String hobby) {
		System.out.println(getHobby());
	}
	
	@Override
	public void printWork() {
		System.out.println(getName()+"공부 중");
	}
	
	
	public void printHobby(String input, char c) {
		String inputChange = "";
		int count = 0;
		inputChange = input.replaceAll(String.valueOf(c), "");
		count = input.length()-inputChange.length();
		System.out.printf('c'+",%d개수",count);
	}
	
	public String getRandomNumber() {
		Random random = new Random();
		String numbers = "";
		for(int i = 0; i < 8; i++) {
			numbers += String.valueOf(random.nextInt(0, 10)) ;
		}
		return numbers;
	}
	
	
}
