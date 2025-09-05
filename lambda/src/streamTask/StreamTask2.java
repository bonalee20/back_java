		//2. IntStream 와 Stream<T> 차이점 이 뒤에 있는 맵은 다른 맵
		//  IntStream 
		//IntStream.rangeClosed(1, 6).map(n->n*10).forEach(datas1::add)); 
		//	datas1.stream().mapToInt(Integer::intValue).sum();//foreach 사용 불가

package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask2 {
   public static void main(String[] args) {
//      1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
//         - 1. Arrays.asList() 초기값으로 넣는 방법
      ArrayList<Integer> datas1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
      datas1.stream().mapToInt(Integer::intValue).sum();
      
//         - 2. IntStream
//      IntStream
      int total = IntStream
         .rangeClosed(1, 6) // intStream
         .map(n -> n * 10)// intStream
         .mapToObj(Integer::valueOf)// Stream<Integer>
         .collect(Collectors.toCollection(ArrayList::new)) //Arraylist<Integer>
         .stream() //Stream<Integer>
         .mapToInt(Integer::intValue) //intStream
         .sum();  //int
      
      
      
//      Stream<T>
//      .mapToObj(): IntStream -> Stream<T>
//      .mapToInt(): Stream<T> -> IntStream
//      .mapToInt(Boolean::booleanValue): Boolean -> boolean
//      .mapToLong(Long::longValue): Long -> long
//      .mapToDouble(Double::doubleValue): Double -> double
      
      
      
      

      
   }
}

