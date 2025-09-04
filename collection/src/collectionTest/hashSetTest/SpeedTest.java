package collectionTest.hashSetTest;

import java.util.HashSet;
import java.util.Iterator;

public class SpeedTest {
	public static void main(String[] args) {
		HashSet<String> mbti = new HashSet<String>();
		mbti.add("a");
		mbti.add("b");
		mbti.add("t");
		
		System.out.println(mbti);
		
		
		Iterator<String> iter = mbti.iterator();
		while(iter.hasNext()) {
			String mbtione = iter.next();
			if(mbtione.equals("a")) {
				System.out.println(mbtione);
			}
			
		}
		
		//main end
	}

}
