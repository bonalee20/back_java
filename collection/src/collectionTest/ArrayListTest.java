package collectionTest;

import java.util.ArrayList;

public class ArrayListTest<T> {
	//<?> : 제네딕 - 포괄적인 즉 이름이 없는 이라는 뜻
	// 지금 당장 무슨 타입일 지 알 수 없을 때 사용하는 타입이다.
	// 사용자가 어떤 타입의 데이터를 넣을지 모르기에 객체화 할 떄 타입을 결정해준다.
	
	T data;
	
	public static void main(String[] args) {
		ArrayList<String> datas = new ArrayList<String>();
		datas.add("lee"); // toString 이미 되어 있음 equals 해야함
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		ArrayList datas3 = new ArrayList(); // 기본은 object
		
		
	}
}
