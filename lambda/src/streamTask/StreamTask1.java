package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask1 {
	public static void main(String[] args) {
		ArrayList<Integer> data1 = new ArrayList<Integer>();
	
//      모두 stream문법으로 사용한다.
      
//      1. 1~10까지 ArrayList에 담고 출력
		IntStream.rangeClosed(1, 10).forEach(n-> data1.add(n));
		data1.forEach(System.out::print);;

//      2. ABCDEF를 각각 문자별로 출력
		IntStream.rangeClosed(0, 5).forEach(n->{System.out.print((char)(n+65));});
		
		IntStream.rangeClosed(0, 5)
			.mapToObj((n)->(char)('A'+ n))
			.collect(Collectors.toCollection(ArrayList::new));
		
		
		System.out.println("3번");
//      3. 1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> data3= new ArrayList<Integer>();
		ArrayList<Integer> data33= new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).forEach(n-> data3.add(n));
		data3.stream().filter((n)-> n%2==1).forEach(n->data33.add(n));
		System.out.println(data33);
		
//      4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
		System.out.println("4번");
		ArrayList<String> data4= new ArrayList<String>();
		IntStream.rangeClosed(0, 5).forEach(n->data4.add(String.valueOf((char)(n+65))));
		data4.remove(3);
		System.out.println(data4);
		
		
//      5. 5개의 문자열을 모두 소문자로 변경 후 출력
//      "Black", "WHITE", "reD", "yeLLow", "PInk"
		System.out.println("5번--------------------------------------------");
		ArrayList<String> data5= new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PInk"));
		data5.stream().map(data -> data.toLowerCase()).forEach(System.out::println);
		data5.stream().map(String::toLowerCase).forEach(System.out::println);
		
		
		
		
//      6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
		System.out.println("6번--------------------------------------------");
		
		ArrayList<String> data6= new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "orange"));
		data6.stream().filter(data -> data.charAt(0)<97).forEach(System.out::println);
		
		data6.stream()
		.filter(data -> data.charAt(0)<97)
		.filter(data -> data.charAt(0)>=65)
		.forEach(System.out::println);
		
		
		
		
//      7. 한글을 정수로 변경 "공칠이삼" -> 0723
		System.out.println("7번--------------------------------------------");
		String hangle = "공일이삼사오육칠팔구";
		// 한글자씩 가지고 오기 chars()
		ArrayList<Character> data7= new ArrayList<Character>(Arrays.asList('공','칠', '이'));

		//data7.stream().map(data->hangle.indexOf(data))
		// "공칠이삼" -> 0723 
		// 공이 들어오면 필터를 통해 공과 일치하는 한글의 인덱스 data.chars()==hangle.chars()
	
		//.filter(data -> data.chars()==number.chars()).forEach(n->data7.add(n)); 
		//.map(data -> "0123456789".indexOf(data)).forEach(System.out::print);
		//data7.stream().map(data -> number.indexOf(number)).forEach(System.out::print);; //칠=7
		//data7.stream().toString().chars().map(c->number.indexOf(String.valueOf(c))).forEach(System.out::print);;
		//data7.stream().toString().chars().forEach(System.out::print);
		//칠을 7으로 바꾸기 7은 number index 7  
		//.filter((c)-> hangle.indexOf(String.valueOf(c)) == number.indexOf(0) )
		
		//data7.stream().map(n->number.indexOf(hangle.indexOf(String.valueOf(n)))).forEach(System.out::print);;
		
		data7.stream().map(n->hangle.indexOf(n)).forEach(System.out::print);

		String input = "일공칠이";
		
		
		
		
		
		
		
		
		
		//.filter((c)-> c == number.indexOf(String.valueOf(c)))
		
		
//      8. 정수를 한글로 변경 0723 -> "공칠이삼"
		System.out.println("\n8번--------------------------------------------");
		ArrayList<Character> data8= new ArrayList<Character>(Arrays.asList('0','7', '2'));
		data8.stream().map(n->hangle.charAt(n-'0')).forEach(System.out::print);
		
	     String input2 = "0723";
	      input2
	         .chars().map(c -> c - 48)
	         .map(hangle::charAt)
	         .mapToObj((c) -> (char)c)
	         .forEach(System.out::println);
	   }
		
	}

