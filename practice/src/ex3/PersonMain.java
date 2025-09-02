package ex3;

public class PersonMain {
	public static void main(String[] args) {

		Person person1 = new Student();
		Student student = (Student)person1;
		student.printHobby("abcde", 'c');
		student.getRandomNumber();
		//student.checkNumber(student);
		System.out.println("\n학번");
		System.out.println(student.getRandomNumber());
		System.out.println();
	}
}

