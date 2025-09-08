package inheritanceTask;

import java.util.Random;

class EmployeeTask extends PersonTask{
	int money = 0;
	public EmployeeTask() {;}
	public EmployeeTask(String name, int age, String address, int phone, int money) {
		super(name, age, address, phone);
		this.money = money;
	}

	void getMoney() {
		Random random = new Random();
		money = random.nextInt(500000);
		System.out.printf("비상금은 %d 원", money);
	}
	
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다");
	}
	@Override
	void sleep() {
		System.out.println("잠을 설친다");
	}
	@Override
	void eat() {
		System.out.println("야식을 먹는다");
	}
	
	
}