package castingTest;

public class CastingTask4 {
	public static void main(String[] args) {
//      "12.123";
//      "345.789"
//      "6789"
//      3개 값을 더해서 123456789를 출력하기
		String num1 = "12.123", num2 = "345.789", num3 = "6789";
		
		int result1 = (int)Double.parseDouble(num1);
		int result2 = (int)Double.parseDouble(num2);
		
		String answer = ""+result1+result2+num3;
		String answer2= String.valueOf(result1)+result2+num3; // 좌 결합성
		
		
		
		
		
		System.out.println(answer);
		System.out.println(answer2);
	}
}
