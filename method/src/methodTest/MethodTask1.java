package methodTest;

public class MethodTask1 {
	
	void printOnetoTen() {
		for(int i = 0; i<10; i++) {
			System.out.println(i+1);
		}
	}
	

	
	public static void main(String[] args) {
		MethodTask1 mt = new MethodTask1();
		mt.printOnetoTen();
		
		// main 끝
	}
	
}
