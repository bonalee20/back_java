package methodTest;
//1. 1~n까지의 합을 구해서 결과를 반환해주는 메서드
//2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드
//3. 문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드
//4. 어떤 문자열을 전달하면 반대로 출력해주는 메서드
//입력 예시) abcdef
//출력 예시) fedcba

import java.util.Scanner;

public class MethodTask5 {
	//1. 1~n까지의 합을 구해서 결과를 반환해주는 메서드
	int add(int num) {
		int sum = 0;
		for(int i = 0; i<num; i++) {
			sum +=i;
		}
		return sum;
	}
	//2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드
	// 매개변수가 숫자와 문자열 구분 아스키 숫자 = 48-57
	// 숫자에서 홀수 짝수 구분
	String check(String thing) {
		String checktype = "";
		for(int i = 0; i<thing.length();i++) {
			//숫자와 문자열
			if((char)thing.charAt(i)>48 && (char)thing.charAt(i)<57) {
				// 홀수,짝수
				if((char)thing.charAt(i)%2==0) {
					checktype=thing +"짝수";
				}if((char)thing.charAt(i)%2==1) {
					checktype=thing +"홀수";
				}
				
			}else {
				checktype=thing +"문자열";
				break;
				}
		}
		return  checktype;
	}
	
	//3. 문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드
	// 소문자를 입력하면고 - 글자를 하나씩 뜯고 
	//+32아스키 코드로 바꿔주고 97 122
	// char 를 담을 string 만들어서 리턴
	String capital(String input) {
		String inputAll = "";
		for(int i = 0; i<input.length();i++) {
			char letter = ' ';
			if((int)input.charAt(i)>96 && (char)input.charAt(i)<123) {
				letter = (char)((int)input.charAt(i)-32);
				inputAll += letter;
			}
		}
		return inputAll;
	}
	
	//4. 어떤 문자열을 전달하면 반대로 출력해주는 메서드
	//입력 예시) abcdef
	//출력 예시) fedcba
	// 문자를 적는다 scanner 
	// 글자를 뜯는다 char
	// 글자 하나를 어떻게 다른 index에 넣을 수 있을까? 
	// abc => 012 => result.length 3 - i -1 => 210

	
	String back(String result) {
		char backword = ' ';
		String backwords ="";
		for(int i = 0; i<result.length();i++) {
			backword = result.charAt(result.length()-i-1);
			backwords += backword;
		}
		return backwords;
	}
	
	
	
	//main start
	public static void main(String[] args) {
		
		// 1번
		MethodTask5 mt1 = new MethodTask5();
		mt1.add(12);
		System.out.println(mt1.add(12));
		System.out.print("\n");
		//2번
		MethodTask5 mt2 = new MethodTask5();
		System.out.println(mt2.check("11"));
		System.out.println(mt2.check("12"));
		System.out.println(mt2.check("r"));
		System.out.print("\n");
		//3번
		MethodTask5 mt3 = new MethodTask5();
		System.out.println(	mt3.capital("abcd"));
		System.out.print("\n");
		// 4번
		Scanner sc = new Scanner(System.in);
		String message ="영어를 입력하세요", user = "";
		System.out.println(message);
		user = sc.next();
		MethodTask5 mt4 = new MethodTask5();
		System.out.println(mt4.back(user));
		
		
		//main end
	}
}
