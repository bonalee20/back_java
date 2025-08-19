package controlStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "MBTI를 입력하세요", mbti =null;
		
		System.out.println(message);
		
		mbti = sc.next();
		
		switch(mbti) {
		case "ENFP":
			System.out.println("게으름");
			break;
		case "INFP":
			System.out.println("오");
			break;
		case "ISFP":
			System.out.println("진");
			break;
		}
	}
}
