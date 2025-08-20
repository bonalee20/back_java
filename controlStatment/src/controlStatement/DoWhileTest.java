package controlStatement;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		String message = "1. 분실 신고 \n2. 통신사 연결";
		int choice = 0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(message);
		choice = sc.nextInt();
		
		do {
			System.out.println(message);
			choice = sc.nextInt();
		} while(choice != 0);
		
		// main end
	}
}
