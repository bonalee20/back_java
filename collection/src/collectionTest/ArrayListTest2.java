package collectionTest;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		datas.size(); // length 와 유사
		datas.add(1); // 값을 넣는 거
		datas.add(10);
		datas.add(100);
		datas.add(80);
		datas.add(1);
		datas.add(10);
		//System.out.println(datas.size());
		System.out.println(datas);
		// 값을 가지고 오는 메서드 IndexOutOfBoundsException e
		try {
			System.out.println(datas.get(0));
		} catch ( IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// 추가 *삽입
		//datas.

		datas.add(50);
		datas.add(500);
		datas.add(80);
		System.out.println(datas);
		datas.indexOf((Integer)10);
		System.out.println(datas.indexOf((Integer)10));
		
		try {
			datas.set(90, 9);
			System.out.println(datas);
		}catch (IndexOutOfBoundsException e) {
			System.out.println("오류입니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류입니다.");
		}
		
		
		
		try {
			datas.remove(80);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("오류입니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		//삭제
		//1. 인덱스으로 삭제 => 
		if(datas.contains(80)) {
			datas.remove(datas.indexOf(80));
			
		}
		
		// 2. 값으로 삭제
		if(datas.contains(500)) {
			// 정수 -> 정수
			//rapping
			datas.remove(Integer.valueOf(500));
			
		}
		System.out.println(datas);
	}
		
}
