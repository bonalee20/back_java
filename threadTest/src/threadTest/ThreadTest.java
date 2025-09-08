package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		// 멀티thread 단일로 부터 시작
//		Thread1 thread1 = new Thread1("?");
//		Thread1 thread2 = new Thread1("!");
//		
//		//단일 스레드
//		//thread1.run();
//		//thread2.run();
//		
//		//멀티 스레드 
//		thread1.start();
//		thread2.start();
		
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		
		
		
		Thread thread1 = new Thread(target2, "1");
		Thread thread2 = new Thread(target2, "0");
		
		
		thread1.start();
		thread2.start();
		// 쓰레드의 우선순위를 변경
		// 하지만 메인쓰레드 보당 우서순위가 높다
		// 강제로 무조건 단일로 처리하듯 할 수ㅇ 있게 한다
		// thread의 으산스으;러비끌데
		thread2.setPriority(1);
		
		
		//스레드의 우선 순위는 jond으로 변경
		// 만약 start() 보다 먼저 join()를 하면 join 무시 가능
		//매번 쓰레드는 코드 할 줄 작성하는 순간 startfc()
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {;}
		
		
		System.out.println("메인스레드");
		
	}
}
