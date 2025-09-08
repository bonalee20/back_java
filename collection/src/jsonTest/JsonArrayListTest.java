package jsonTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;


public class JsonArrayListTest {
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		JSONArray usersJson = new JSONArray();
		JSONObject userJson = new JSONObject();
		
		User user1 = new User(1L,"고길동", 42,"개발자");
		User user2 = new User(2L,"장보고", 20,"기획자");
		User user3 = new User(2L,"장보고", 35,"디자이너");
		User user4 = new User(3L,"이순신", 17,"개발자");
		User user5 = new User(4L,"둘리", 22,"사장");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		System.out.println(users);
		new JSONObject(users);
		
	// 반복문을 돈다
	// 생성자를 이용해서 JSONObject 객체화 (User 클래스)
	// JSONArray 넣기
		
		// 반복문을 돈다
		for(int i = 0; i <users.size(); i++) {
			usersJson.put(new JSONObject(users.get(i)));
		}
		// 생성자를 이용해서 JSONObject 객체화 (User 클래스)
		// JSONArray 넣기
		System.out.println(usersJson);
		
		users.stream();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
