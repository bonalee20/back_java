package castingTask2;

public class Human extends NotPlayerCharcter{
	public Human() {;}
	@Override
	void hunt() {
		System.out.println("해치웠나..?");
	}
	@Override
	void drop() {
		// TODO Auto-generated method stub
		super.drop();
	}
	
//	@Override
//	void drop() {
//		System.out.println("골드 얻음");
//	}
	
}
