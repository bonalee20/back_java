package streamTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class StreamTask3 {

	public boolean isOdd(int num) {
		return num %2 == 1;
	}
	
	public static void main(String[] args) {
		
		StreamTask3 st = new StreamTask3();
		//IntStream으로 시작  .mapToObj(): IntStream -> Stream<T>
		// datas1.stream().mapToInt(Integer::intValue).sum();
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		
		IntStream
			.range(1, 10)
			.filter(st::isOdd)
			.map(n->n*10)
			.mapToObj(Integer::valueOf) //기본형에서 Integer로 만들기 
			.collect(Collectors.toCollection(ArrayList::new)) // ArrayList<Integer> 으로 타입 변경
			.forEach(System.out::print);

		
		// 리턴 타입 적기
		List<Integer> data = IntStream
				.range(1, 10) //intstream
				.filter(st::isOdd)  //intstream
				.map(n->n*10)  //intstream
				.boxed() //Stream<Integer>
				.collect(Collectors.toList()); // List<Integer>
		
		System.out.println(data);

	
		
	}
}
