//day15 3교시, 4 
package streamTest.mapTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MapTest {
   public static void main(String[] args) {
      
      ArrayList<User> users = new ArrayList<User>(); 
      
      User user1 = new User(1L, "홍길동", 17, "개발자");
      User user2 = new User(1L, "장보고", 20, "기획자");
      User user3 = new User(1L, "이순신", 35, "디자이너");
      User user4 = new User(1L, "이성계", 42, "개발자");
      User user5 = new User(1L, "이태희", 22, "사장");
      
      users.add(user1);
      users.add(user2);
      users.add(user3);
      users.add(user4);
      users.add(user5);
      
      //["홍길동", "장보고" ---]
      users.stream().map((user) -> user.getName());
      //["홍길동", "장보고" ---]
      
      //1. ArrayList를 생성한다 datas1
      ArrayList<Integer> datas1 = new ArrayList<Integer>();
      IntStream.range(1, 11).forEach(datas1::add);
      datas1.stream().map((n) -> n*10).forEach(System.out::print);     
      System.out.println(datas1);
      
      //2. 1~10까지 datas1 에 추가한다
      //3. datas1의 모든 값을 10배로 변경한다.
      //4. datas2의 모든 값을 출력한다.

      System.out.println("\n2번");

      

      
//    2. .map()
//    ArrayList의 값을 알파벳으로 바꿔서 출력하기
//    ex)원본 [1, 2, 3, 4, 5, ..., 10]
//    ex)변경 ['A', 'B', 'C', ... 'J']
      ArrayList<Integer> datas2 = new ArrayList<Integer>();
      IntStream.range(1, 11).forEach(datas2::add);
      System.out.println(datas2);
      datas2.stream().map((n)-> (char)(n+64)).forEach(System.out::print);  
      
      // 배열에 담아서 출력 ['A', 'B', 'C', ... 'J'] ???
     // datas2 = datas2.stream().map((n)-> (char)(n+64)).add(); 
      

      

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
   }
