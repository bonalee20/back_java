package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask2 {
	public static void main(String[] args) {
		ArrayList<String> datas = new ArrayList(); //import 필수
		for(int i = 0; i < 26; i++) {
			datas.add(String.valueOf((char)(i+97)));
		}
		
		System.out.println(datas);
		
		for(int i = 0; i < datas.size(); i++) {
			if(i%2==0) {
				datas.get(i).toUpperCase();
				System.out.print(datas.get(i).toUpperCase());
				
			}
		}
	
	}
}
