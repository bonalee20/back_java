package castingTask2;

public class Fairy extends NotPlayerCharcter{
	public Fairy() {;}
	@Override
	void hunt() {
		System.out.println("ㄱr끔 눈물을 흘린다...");
	}
	@Override
	void drop() {
		System.out.println("팬던트 얻음");
	}
	void wing() {
		System.out.println("B 요정 죽음");
	}
}

