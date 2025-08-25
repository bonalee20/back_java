package inheritanceTask;


class StudentTask extends PersonTask {
	String id;
	public StudentTask() {;}
	public StudentTask(String name, int age, String address, int phone,String id) {
		super(name, age, address, phone);
		this.id = id;
	}
	
	@Override
	void work() {
		System.out.println("아르바이트를 한다");
	}
	@Override
	void sleep() {
		System.out.println("수업시간에 잠을 잔다.");
	}
	@Override
	void eat() {
		System.out.println("아침을 거른다.");
	}
	
}