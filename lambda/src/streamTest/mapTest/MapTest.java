//day15 3교시, 4 
package streamTest.mapTest;

import java.util.ArrayList;

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
      
      //1. ArrayList를 생성한ㄷ. datas1
      //2. 1~10까지 datas1 에 추가한다
      //3. datas1의 모든 값을 10배로 변경한다.
      //4. datas2의 모든 값을 출력한다.
      
      
      
      
      
      
   }
   }
