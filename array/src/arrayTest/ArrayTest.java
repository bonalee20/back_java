package arrayTest;

public class ArrayTest {
	public static void main(String[] args) {
		int [] arData1 = {1, 2, 3, 4};
		
		int [] arData2 = new int[5]; // new 는 heap 메모리에 할당시키는 동시에 자동으로 초기화하고 들고 오는  연산자 
		int [] arData3 = null; // 주소의 초기값 = null
		
		System.out.println(arData1[0]); // 배열의 해시코드 (주소)가 들어가 있음
		// heap 올린다.= 동적 메모리 할당 
		// 칸 수를 왜 만든냐? 자바는 정적 메모리 할당, 메모리 낭비 싫음 \ 미리 메모리를 할당하기 위해
		
		////////////////////////////////////////////////
		// 배열
		for(int i=0; i<4;i++) {
			System.out.println(arData1[i]);
		}
		
		
		
		
		
		
		//main end
	}
}
