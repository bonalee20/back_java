package methodTest;

public class MethodTest {
	// 매서드 선언
	void printName(String name) {
		System.out.println(name);
	}
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	
// 1. 3개의 정수를 받아서 , 모두 뺀 값을 반환해 주는 메서드 선언	
	// 리턴 타입은 void 부터 쓰고 다 쓰고 마지막에 타입 변화 !!!
	int sub(int num1, int num2, int num3) {
		return num1 -num2 -num3;
	}
	
//  2. 성과 이름을 붙여서 출력해주는 메서드 선언
	
	void printFullName(String lastname, String firstname) {
		System.out.println(lastname+firstname); 
	}
	
	
	//main method 
	public static void main(String[] args) {
		// 클래스 안에 메서드
		// 메서드를 사용할려면 그 클래스부터 찾아라 , 램에 올려야함
		MethodTest mt = new MethodTest();
		mt.printFullName("고","길동");
		
		
		
		// main end
	}
	
}
