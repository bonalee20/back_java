package formatTest;

public class FormatTest {
	public static void main(String[] args) {
		//
		String name="이영서";
		int age=24;
		double height=165.0;
		
		System.out.printf("저의 이름은 %s입니다", name);
		System.out.printf("저의 나이는 %d입니다", age);
		System.out.printf("저의 키는 %.2f입니다", height); // 두자리 수 표현법 .2 붙이기
	}
}
