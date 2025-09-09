package collectionTest.hashMapTest;

import java.util.HashMap;

public class HashMapTest {
	// hashMap은 바로 json 으로 바꿀 수 있어서 사용성 높음
	
	public static void main(String[] args) {
		// hashMap put 푹 넣어야함 ( 값을 추가 )
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "bona");
		userMap.put("name", "이영서");
		userMap.put("password", "bona");
		userMap.put("age", 20);
		userMap.put("isRich", true);
		
		System.out.println(userMap); //{password=bona, name=이영서, id=bona, age=20, isRich=true}
		System.out.println(userMap.get("age")); // 20
		
		// ===============
		// key = value는 한 쌍이다.=> entrySet => upcasting interator;
		
		
		System.out.println(userMap.entrySet());
		// set 자료 구조에 key = value이 퍼져있다.
		
		
	}
}
