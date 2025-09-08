package collectionTest.hashMapTest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;


// HashMap 자료구조
//"street": "Victor Plains",
//"suite": "Suite 879",
//"city": "Wisokyburgh",
//"zipcode": "90566-7771",
//"lat": "-43.9509",
//"lng": "-34.4618"
// arraylist



public class HashMapTask1 {
	public static void main(String[] args) {
		HashMap<String, Object> user = new HashMap<String, Object>();
		user.put("street","Victor Plains");
		user.put("suite", "Suite 879");
		user.put("city", "Wisokyburgh");
		user.put("zipcode","90566-7771");
		user.put("lat", "-43.9509");
		user.put("lng", "-34.4618");
		user.keySet();
		user.values();
		new ArrayList(user.values());
		
		System.out.println(new ArrayList(user.values()));
		
		
		
		//Iterator: 순서가 없을 때 순서를 부여할 수 있는 인테페이스
		Iterator<Entry<String, Object>> userMapIter = user.entrySet().iterator();
		ArrayList<Object> arraylist = new ArrayList<Object>();

		// 하나만 가지고 오는데 반복을 돌려서 어디에 놓지???
		System.out.println(userMapIter.next().getValue());

		while(userMapIter.hasNext()) {
			System.out.println(userMapIter.next().getValue());
			//arraylist.add(userMapIter.next().getValue());
		}


		
	}

}	
