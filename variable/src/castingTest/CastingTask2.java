package castingTest;

public class CastingTask2 {
	public static void main(String[] args) {
		//1 + "8.24" + "7.8" 두 값을 더해서 115로 만들어 출력하기
		int num1 = 1;
		String num2 = "8.24", num3 = "7.8";
		int result = (int)Double.parseDouble(num2)+(int)Double.parseDouble(num3);
		System.out.println("" + num1+result);
		
		
		
	}
}
