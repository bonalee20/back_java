package castingTask3;

public class Animation extends Video {
	public Animation() {;}
	
	public Animation(String name, int time) {
		super(name, time);
	}
	@Override
	void add() {
		System.out.println("자막 지원");
		
		}
}
