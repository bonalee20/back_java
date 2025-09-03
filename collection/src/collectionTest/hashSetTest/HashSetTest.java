package collectionTest.hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		mbtiType.add("ISTP");
		mbtiType.add("ISTJ");
		mbtiType.add("ESTP");
		mbtiType.add("INTP");
		mbtiType.add("ENTP");
		mbtiType.add("ISTP");
		
		System.out.println(mbtiType);// 순서 없음
		// 데이커를 가져오고 싶을 때 순서를 부여해야한다.
		
		//Iterator: 순서가 없을 때 순서를 부여할 수 있는 인테페이스
		Iterator<String> iter = mbtiType.iterator();
		while(iter.hasNext()) {
			String mbti = iter.next();
			if(mbti.equals("ENTP")) {
				System.out.println(mbti);
			}
			
		}
		// 중복된 데이터를 삭제하고 싶을 때
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10,10,30,40,50));
		datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
		System.out.println(datas);
		
		
	}
	
}