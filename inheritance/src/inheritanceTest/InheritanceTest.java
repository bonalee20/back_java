package inheritanceTest;

// 부모 클래스
class A {
	String name;
	int data;
	
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
		this.name = "A";
		this.data = 10;
	}
	
	
	void printNameA() {
		System.out.println(name);
	}
	
	void walk () {
		System.out.println("4발");
	}
}

//자식 클래스
class B extends A{
	public B() {
		super();// 부모의 생성자
		System.out.println(this);
		System.out.println("자식 생성자 호출");
	}
	
	void printData() {
		System.out.println(data);
		System.out.println(this.data); 
		System.out.println(super.data); // 부모를 호출하는 키워드
	}
	
	// 오버 라이딩 부모의 메서드 이름과 동일, 자식이 부모의 코드를 덮어쓰다.( 올라타다, 무시하다, 재정의 )
	@Override // 어도테이션
	void walk() { //새롭게 할당된 게 아님
		System.out.println("두발");
	} // 부모의 메서도에 할당하고 플러스 알파가 아닌 부모의 메서드 수정
	
}


public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		b.printNameA();
		b.printData();
		b.walk();
		a.walk();// 별개의 클래스 오버라이드와 상관 없다
 	}
	
}
