package jsonTest;

import java.util.HashMap;

import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> user = new HashMap<String, Object>();
		user.put("street","Victor Plains");
		user.put("suite", "Suite 879");
		user.put("city", "Wisokyburgh");
		user.put("zipcode","90566-7771");
		user.put("lat", "-43.9509");
		user.put("lng", "-34.4618");
		
		// 초기값을 이용하자
		JSONObject json = new JSONObject(user);

		System.out.println(json);
	}
	
}
