package controlStatement;

import java.util.Scanner;

public class IfTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "두 수를 입력하세요", num1 = "", num2 = "";
		int result = 0;
		
		System.out.println(message);
		num1 = sc.next();
		num2 = sc.next();
		
		result = Integer.parseInt(num1) - Integer.parseInt(num2);
		
	}
}


//두 수의 크기 비교
//입력예시) 10 20
//출력예시) 큰 값: 20, 작은 값: 10
//if문으로