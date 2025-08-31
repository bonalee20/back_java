package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "3개의 정수를  입력하세요";
		int result = 0, number1 = 0, number2 = 0, number3 = 0;
		
		System.out.println(message);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		sc.close(); // 외부 장치 닫아주기 !!!
		result = number1*number2*number3;
		
		System.out.printf("입력한 정수는 %d, %d, %d입니다. \n세 개의 정수 곱은 %d입니다.",number1,number2,number3, result);
	}
}
