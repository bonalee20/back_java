package castingTest;

public class CastingTask3 {
	public static void main(String[] args) {
		//String.valueOf(값);
		//   어떤 값을 문자열로 형변환시켜주는 메서드 ((int)a)*65/97 = A
		char a ='a', j='j', k='k', A='A';
		// 아스키 코드 = char 를 숫자로 연산 a=97 A=65 /꼬부랑 a => 나이가 많다(97)
		
		int num1=((int)a)*65/97;
		
		System.out.println((char)num1);
		System.out.println((char)(((int)j)*74/106));
		System.out.println((char)(((int)k)*75/107));
		
	}
}
