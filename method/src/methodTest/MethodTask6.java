package methodTest;

import java.util.Scanner;
//.replace(문자열, 대체할 문자열)
//.replaceAll(문자열, 대체할 문자열)


public class MethodTask6 {
	// 문자열을 입력받고 원하는 문자 개수 를 구해주는 메서드
	// 메서드 매개변수 = 문자
	// 문자를 하나씩 뜯어서 정수 변수에 넣기
	// 사용에서 스캐너 사용해 user,userA를 메서드의 인자로 넣기
	
	int countWord(String words, char word) {
		int count=0;
		count = words.length()- words.replaceAll(String.valueOf(word),"").length();
		
		return count;
	}
	
	
	
	//main start
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String message = "영어 단어를 입력하세요", user = "", userA = "";;
		System.out.println(message);
		user = sc.next();
		userA = sc.next();
		MethodTask6 mt= new MethodTask6();
	
		
		// main end
	}
}
