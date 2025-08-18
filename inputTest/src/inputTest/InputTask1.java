package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "두 수를 입력하세요 /n ex) 10 20", num1 = null, num2 = null;
		int result = 0, number1 = 0, number2 =0;
		
		System.out.println(message);
		num1 = sc.next();
		num2 = sc.next();
		number1 = Integer.parseInt(num1);
		number2 = Integer.parseInt(num2);
		result = number1+number2;
		
		System.out.println(result);
		System.out.printf("첫 번째 정수는 %s, 두 번째 정수는 %s",num1,num2);
	};
};