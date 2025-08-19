package controlStatement;

public class ForTask2 {
	public static void main(String[] args) {
		// 10-1
		//  abcd => 97
		
		String result= "abcd";
		int sum = 0;
		for(int i=0; i<4; i++) {
			System.out.println((int)result.charAt(i));
		}
		
		for(int i=0;i<4;i++) {
			if(i==2) {
				continue;
			}
			System.out.print(result.charAt(i));
		}
		// 1~30 짝수를출력

		for(int i = 0;i<15;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		// 1~30 짝수의 개수
		int count = 0;
		for(int i = 0;i<30;i++) {
			if((i+1)%2==0) {
				count++;
			}
		}
		System.out.println(count);
		
		// 1~30 짝수 총합
		
		for(int i = 0;i<31;i++) {
			if(i%2==0) {
				sum +=i;
			}
		}
		System.out.println(sum);

		// 1~30 짝수 중 7 번
		for(int i=0;i<31;i++) {
			if(count == 7) {
				break;
			}
			if(i%2==0) {
				count++;
			}
			
			System.out.println(count);
		}
		
		}
		
	}

