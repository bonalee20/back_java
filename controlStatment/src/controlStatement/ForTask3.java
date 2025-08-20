package controlStatement;

public class ForTask3 {
	public static void main(String[] args) {
//     @ 1번 문제=7의 배수
		int sum = 0;
		for(int i = 0; i<100; i++) {
			int value = i+1;
			if(value%7==0) {
				sum += value;
			}
		}
		System.out.println(sum);
		
//      @ 2번 문제= a ~ z까지 반복해서 아래의 결과를 출력한다
//      "aBcDeFg ... Z"
		System.out.println((char)97);
		// 아스키 코드 이용한다
		
		int askyB=64, askya=96;
		for(int i = 1; i< 27;i++) {
			if(i%2==0) {
				int value = i+askyB;
				System.out.print((char)(value));
			}else if(i%2==1){
				System.out.print((char)(i+askya));
			}
			// 삼항 쓰기 (char)((i%2==0? 97:65) + i)
		
		}
		
}
}
