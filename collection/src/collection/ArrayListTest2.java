package collection;

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
		datas.add(90);
		System.out.println(datas);
		
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

		
	}
		
}
