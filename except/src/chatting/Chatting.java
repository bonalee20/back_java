package chatting;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("상대방에게 받을 메세지");
		message = sc.nextLine();
		try {
			if(message.contains("꿀꿀")) {
				throw new BadWordException("꿀꿀이는 너무합니다.");
			}else {
				System.out.println(message);
			}
		} catch (Exception e) {
			System.out.println("no 비속어");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
		
		
		
		
		
	}
}
