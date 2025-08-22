package classTest;
//동물(ClassTask)
//이름(name), 나이(age), 먹이(feed)
//추상화
//기본 생성자, 초기화 생성자
//토끼, 강아지, 고양이 객체(객체화)


public class ClassTask {
	// 추상화
	String name;
	int age;
	String feed;
	
// 생성자의 오버로딩
	
	// 기본 생성자
	public ClassTask() {;}
	// 초기화 생성자 = alt + shift + s => o (generate ...)
	public ClassTask(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	public static void main(String[] args) {
	// 객체화
		ClassTask animal = new ClassTask("토끼",10,"풀");
		System.out.println(animal.feed);
		ClassTask ct2 = new ClassTask("강아지",5,"사료");
		System.out.println(ct2.feed);
		ClassTask ct3 = new ClassTask("고양이",15,"쥐");
		System.out.println(ct3.feed);
		
	}
}
