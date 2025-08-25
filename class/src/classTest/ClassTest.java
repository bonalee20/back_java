package classTest;

public class ClassTest {
	//필드, 멤버, 필드 변수
	String name;
	int age;
	
	
	// 기본 생성자
	public ClassTest() {;}
	
	// 초기화 생성자
	public ClassTest(String name, int age) {
		// this 자기 자신의 주소값
		this.name = name;
		this.age = age;
	}	
	
	
	
	public static void main(String[] args) {
		//        객체화
// 생성자= heap 메모리에 할당시킨 (ClassTest)주소 값를  가지고 옴 ( 리턴값 = 주소 값)
		ClassTest ct1 = new ClassTest("고길동", 20); //생성자를 통해 객체가 만들어짐
	 //   타입    객체 이름 = (주소) 값
		System.out.println(ct1.age);
		
		ClassTest ct2 = new ClassTest();
		System.out.println(ct2);
		
	}
	
	
}
