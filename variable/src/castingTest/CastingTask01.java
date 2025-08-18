package castingTest;

public class CastingTask01 {
	public static void main(String[] args) {
		// 8.43 + 2.59 = 10
		double eight = 8.43, two = 2.59;
		int result=0;
		result = (int)eight + (int)two;
		
		System.out.println(result);
		System.out.printf("%.2f+%.2f = %d로 강제로 형변환", eight, two, result); 
		
		
		// 자동형변환
		// 문자령 + 정수=정수
		// 아스키 코드 = char 를 숫자로 연산 a=97 A=65 꼬부랑 a = 나이가 많다
		// char + int = 정수
		System.out.println('a'+10);
		System.out.println((char)('A'*100));
		
	}
}
