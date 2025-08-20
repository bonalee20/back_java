package controlStatement;

public class ForTask2 {
	public static void main(String[] args) {
		
		
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
		// 문제 1 = 1~30 짝수를출력

		for(int i = 0;i<15;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		// 문제 2 = 1~30 짝수의 개수
		int count = 0;
		for(int i = 0;i<30;i++) {
			if((i+1)%2==0) {
				count++;
			}
		}
		System.out.println(count);
		
		// 문제 3 = 1~30 짝수 총합
		
		for(int i = 0;i<31;i++) {
			if(i%2==0) {
				sum +=i;
			}
		}
		System.out.println(sum);

		// 문제 4 = 1~30 짝수 중 7 번
		for(int i=0;i<31;i++) {
			if(count == 7) {
				break;
			}
			if(i%2==0) {
				count++;
			}
			
			System.out.println(count);
		}
		 //문제 5 == 1~30까지 짝수중 첫번째 짝수와 마지막 짝수만 더해서 출력하기
		int min = 0;
		int max = 0;
		for(int i = 0; i < 30; i++) {
			int value = i + 1;
			if(value % 2 == 0) {
				if(min == 0) {
			    min = value;
			    }
			    if(value < min) {
			     min = value;
			    }
			    if(value > max) {
			      max = value;
			    }
		    }
		}
		System.out.println(min + max);

		
		// main 끝
		}
		
	}

