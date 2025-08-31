package castingTest;

public class CastingTest {
	public static void main(String[] args) {
		// 정수 + 실수 = 실수
		System.out.println(1+2.5);
		System.out.println(3/2); // 정수여서 1.5가 아니라 1이 나옴
		System.out.println(3.0/2); // 실수여서 1.5
		
		// 강제 형변환
		System.out.println(5/(double)2); 
		System.out.println((int)(5/(double)2)); 

	}
}
