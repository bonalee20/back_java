package methodTest;

import java.util.Scanner;

public class MethodTast4 {
	// 1. 사용자에게 이름과 반복 횟수를 받아서 반복 횟수만큼 이름을 출력해주는 메서드
	// 2. 1번 메서드 사용
	
	void printNametoNumber(String name, int number) {
		for(int i = 0; i<number;i++) {
			System.out.println(name);
		}
	}
	
	//main start
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "name number", user = "";
		System.out.println(message);
		int usernum =0;
		
		user = sc.next();
		usernum = sc.nextInt();
		MethodTast4 mt = new MethodTast4();
		mt.printNametoNumber(user, usernum);
		
		
	
		// main end
	}
}
