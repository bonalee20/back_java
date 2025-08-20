package controlStatement;

import java.util.Scanner;

//1. ACEG...Z 출력!
//2. 1 ~ N까지의 합 출력!
//3. 0123401234 출력!

//4. 입력예시) a1b22c357
//abbbbbbbbbbbbbbccccccccccccccccccccccccccccccccc
//사용자가 입력한 횟수가 얼마가 있을지 모르고, 
//입력한 횟수만큼 반복해주는 프로그램 만들기

public class ForTask5 {
	public static void main(String[] args) {
		//1번
		for(int i=0;i<26;i+=2) {
			System.out.print((char)(i+65));
		}
		
		//2번
		// 5 입력하면 1,2,3,4,5 를 더하자
		Scanner sc = new Scanner(System.in);
		System.out.println("\n숫자를 입력하면 그 숫자까지의 합을 구합니다.");
		int input1 = 0, sum = 0;
		input1 = sc.nextInt();
		for(int i=0;i<(input1+1);i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		//3번 0123401234 출력!
		for(int j =0;j<10;j++) {
			System.out.print(j%5);
		}
		
		//4. 입력예시) a1b22c357
		//abbbbbbbbbbbbbbccccccccccccccccccccccccccccccccc
		//사용자가 입력한 횟수가 얼마가 있을지 모르고, 
		//입력한 횟수만큼 반복해주는 프로그램 만들기
		System.out.println("\n숫자 + 문자를 입력하세요");
		String input2 = "", result = "";
		input2 = sc.next();
		for(int a = 0; a < input2.length(); a++) {
			if(input2.charAt(a) > 64) {
				result += input2.charAt(a);
				System.out.println(input2.charAt(a));
			}else {
				// 숫자를 어떻게 할까? 문자들을 기준으로 나누고 싶다. 
				for(int b=0;b<input2.length();b++) {
					
				}
			}
		
			
			
			// for end
		}
		
		
		
		
		// main end
	}
}
