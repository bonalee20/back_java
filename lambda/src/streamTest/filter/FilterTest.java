//day15 수정 필요

package streamTest.filter;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterTest {
 public static void main(String[] args) {
	
	 //ArrayList
	 
	 IntStream.rangeClosed(1, 10).filter((n) -> n % 2 == 0).forEach(System.out::println);
     ArrayList<Integer> numbers = IntStream.rangeClosed(1, 10)
           .filter((n) -> n % 2 == 0)
           .boxed()
           .collect(Collectors.toCollection(ArrayList::new));
	 
	 
	 
 }
}
