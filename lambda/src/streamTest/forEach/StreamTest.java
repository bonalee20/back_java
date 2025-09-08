package streamTest.forEach;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest {
	static public void getOdd(int n) {
		if(n%2==0) {
			System.out.println(n);
		}
	}
	
	
	public static void main(String[] args) {
		// IntStream 역할 = 정수형 문법을 이용해서 stream 
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		//.range(시작 포함, 끝 포함 안 됨)
		IntStream.rangeClosed(0, 10).forEach((n) -> datas.add(n));
		//.rangeClosed(시작 포함, 끝 포함)
		System.out.println(datas);
		
		
		//2. 
		System.out.println("\n");
		ArrayList<Integer> data2 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 5).forEach((n) -> data2.add(1));
		System.out.println(data2);
		
		// 참조형 문법
		//.(소속::메서드명)
		
		IntStream.rangeClosed(1, 5).forEach((n) -> System.out.println(n));
		IntStream.rangeClosed(1, 5).forEach(System.out::println);
		
		
		//3. datas 짝수만 출력하기
		System.out.println("\n");
		//add
		//datas.forEach((n)->datas.add(2*n));
		//IntStream.rangeClosed(0, 5).forEach((n) -> datas.add(2*n));
		System.out.println(datas);
		//datas.forEach((n)->datas.add(n, 2n));
		
		
		/// forEach 
		datas.forEach((n)->{
			if(n%2==0) {
				System.out.println(n);
			}
		});
		
		System.out.println("\n");
		
		//3. datas odd만 출력하기 => a메서드 만드릭
		datas.forEach(StreamTest::getOdd);
		
		//4.
		//.stream = 컬랙션을 Stream 객체로 변경
		//.chars = 문자열을 Stream 객체로 변경
		"ABCD".chars().forEach(System.out::print);
		
//====== day 15 ==============================================================================================
		//5. stream -> filter 가능
		
		
		
		
		
	}
}
