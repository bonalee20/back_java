package methodTest;

public class MethodTask3 {
	// 1. 1 ~ n번까지 출력해주는 함수
	// 2. 1번 메서드 사용
	
	void printNumber(int num) {
		for(int i = 0; i<num; i++) {
			int value = i+1;
			System.out.print(value+" ");
		}
	}
	
	// main start
	public static void main(String[] args) {
		MethodTask3 mt = new MethodTask3(); // heap 메모리에 올리기
		mt.printNumber(8);
		// main end
	}
}
