	//day15
package streamTest.forEach;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest2 {
	static public void getOdd(int n) {
		if(n%2==0) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		// 1~10까지 출력
		// 값을 넣어준다. foreach에서 괄호 생략하지 않기!!!! ***
		IntStream.rangeClosed(1, 10).forEach((n) -> {datas1.add(n);});
		System.out.println(datas1);
		
		//1. datas에서 stream 문법으로 1~5까지 지우기
		// 반복이 돌면서 배열의 인덱스 변화
		// 인덱스 변화 고치기
		// 0일때 1삭제[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		// 1일떄  3삭제[ 2, 4, 5, 6, 7, 8, 9, 10]
		// 참조를 할 수 없는 알고리즘!!
		IntStream.range(0, 5).forEach((n) -> {datas1.remove(0);});
		System.out.println(datas1);
		
		
		//2.10~1까지 추가
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach((n) -> {datas2.add(11-n);});
		System.out.println(datas2);
		
		//3. "ABCDEFGHIJK" 을 datas3에 각각 한글자 씩 출력하기
		ArrayList<String> datas3 = new ArrayList<String>();
		"ABCDEFGHIJK".chars().forEach((n)->{datas3.add(String.valueOf((char)n));});
		datas3.forEach(System.out::print);
		
		//4."aBcDeFgHiJk"을 datas4에 소문자만 각각 한 글자씩 추가 후 출력하기
		System.out.println("\n4번");
		ArrayList<String> datas4 = new ArrayList<String>();
		"aBcDeFgHiJk".chars().forEach((n) -> {
			if(n>=97 && n <=122) {
				datas4.add(String.valueOf((char)(n)));
			}
			} );
		
		
		
		//5.
		System.out.println("\n5번");
		
		datas4.forEach(System.out::print);
		"aBcDeFgHiJk".toUpperCase().chars().forEach((n)->{datas3.add(String.valueOf((char)n));});
		datas4.forEach(System.out::print);
		
		
		ArrayList<String> datas5 = new ArrayList<String>();
		
		"aBcDeFgHiJk".chars().forEach((n) -> {
			if(n>=97 && n <=122) {
				datas5.add(String.valueOf((char)(n-32)));
			}else {
				datas5.add(String.valueOf((char)n));
			}
			} );
		
		datas5.forEach(System.out::print);
		
		//6.
		System.out.println("\n6번");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
