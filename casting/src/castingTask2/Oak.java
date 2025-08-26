package castingTask2;

public class Oak extends NotPlayerCharcter{

	public Oak() {;}
	
	@Override
	void hunt() {
		System.out.println("콜록!");
	} 
	
	@Override
	void drop() {
		System.out.println("도끼 얻음");
	}
	void face() {
		System.out.println("Z.Z 오크 죽음");
	}
}

