package castingTest;

public class CastingTask03 {
	public static void main(String[] args) {
		// 문자열의 강제 형변환
		System.out.println(Integer.parseInt("10") -5); //5
		System.out.println(Boolean.parseBoolean("10")); //false ==> 정수로 바뀔 수 있는 값
		System.out.println(Boolean.parseBoolean("TRUE")); // true
		System.out.println(Float.parseFloat("10")); // float
		System.out.println(Double.parseDouble("10")); // double
		
	}
}
