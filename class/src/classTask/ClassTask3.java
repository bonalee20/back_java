package classTask;

// 2개의 값을 전달하면 최솟값과 최댓값을 구해주는 메서드
// 클래스
class Number{
	int number1;
	int number2;
	public Number() {;}
	public Number(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
}

class Math{
	int num1;
	int num2;
	
	public Math() {;}

	public Math(Number ct2) {
		this.num1 = ct2.number1;
		this.num2 = ct2.number2;
	}
	
	void bigNum(Number ct2) {
		if(ct2.number1 - ct2.number2 > 0) {
			System.out.println(ct2.number1 + "최대");
		}else if(ct2.number1 - ct2.number2 == 0) {
			System.out.println("같다");
		}else {
			System.out.println(ct2.number2 + "최대");
		}

	}
	
}

public class ClassTask3 {
	public static void main(String[] args) {
		Number ct2 = new Number(1,2);
		Math ct1 = new Math();
		ct1.bigNum(ct2);
		
	}
	
}
