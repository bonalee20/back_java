package methodTest;

public class MethodTask2 {
	void printNametoTen(String name) {
		for(int i=0;i<10;i++) {
			System.out.println(name);
		}
	}
	
	//main 시작
	public static void main(String[] args) {
		MethodTask2 mt = new MethodTask2();
		mt.printNametoTen("고길동");
		// main end
	}
}
