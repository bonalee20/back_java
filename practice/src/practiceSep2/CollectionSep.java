package practiceSep2;

import java.util.ArrayList;

public class CollectionSep {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList();
		datas.add(1);
		datas.add(50);
		datas.add(500);
		datas.add(80);
		// set = 수정(index, 수정할 값 Integer element)
		try {
			datas.set(1, 11);
		}catch (IndexOutOfBoundsException e) {
			System.out.println("오류입니다.");
		} catch (Exception e) {
			System.out.println("오류입니다.");
		}
		
		//삭제 = remove
		//1. 인덱스으로 삭제 
		if(datas.contains(1)) {
			datas.remove(datas.indexOf(1));
		}
		
		System.out.println(datas);
		// 2. 값으로 삭제
		if(datas.contains(80)) {
			datas.remove(Integer.valueOf(80));
		}
		System.out.println(datas);
	}
}
