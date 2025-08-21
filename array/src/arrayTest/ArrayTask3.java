package arrayTest;

public class ArrayTask3 {
	public static void main(String[] args) {
//      1. 1~20까지 짝수만 배열에 담고 배열안에 값에 모두 3을 더한 값으로 변경 후 출력하기  
		// 짝수 인자+3  반복문으로 넣고
		// 
		int arData1[] = new int [21];
		String ar = "";
		for(int i =1; i<21;i ++) {
			if(i%2==0) {
				arData1[i]=i;
				ar+=i+3;
				
			}
		
		}
		
		
		
		System.out.print(ar);
		
		System.out.println("\n기본");
		int [] arData = new int [10];
		for(int i=0;i<10;i++) {
			arData[i]=(i+1)*2;
			arData[i] += 3;
			System.out.println(arData[i]);
		}
		System.out.println("\n");
		
//      2. 초기값으로 10, 20, 30, 40, 50 값을 넣고 평균을 출력하기
		int arData2[] = {10, 20, 30, 40, 50};
		int sum = 0, average = 0;
		for(int i = 0; i<5; i++) {
			sum += arData2[i];
		}
		average = sum/5;
		System.out.printf("평균= %d",average);
		
		
		
		System.out.println("\n");
//      3. 1~10까지 배열에 담고 값이 5보다 크다면 값을 2배로 변경해서 출력하기 
		// 반복문 안에 조건문으로 5보다 크다면 값을 2배로 변경
		int arData3[] = new int [11];
		for(int i = 1; i <11; i++) {
			// 삼항 연습
			if(i>5) {
				arData3[i] = 2*i;
			}else {
				arData3[i] = i;
			}
		
			System.out.print(arData3[i]);
		}
		System.out.println("\n");
		// 삼항 연습
		
//      4. 1~10까지 배열에 담고, 모든 값에 *을 붙여서 출력하기 1*2*3*4*...10 
//      단 마지막은 *이 붙지 않는다
		// for 문을 하고 =>조건문에 마지막에는 * 놉
		String arData4 [] = new String [11];
		for(int i = 1; i<11; i++) {
			if(i==10) {
				arData4[i]=String.valueOf(i);
			}else {
				arData4[i]=String.valueOf(i)+"*";
			}
			System.out.print(arData4[i]);
		}
		
//      5. 1~10까지 배열에 담고 들어간 값 중 3의 배수만 모두 더해서 출력하기
		int arData5[] = new int[11];
		int total = 0;
		
		for(int i = 1 ; i<11; i++) {
			if(i%3==0) {
				arData5[i] = i;
				total +=i;
				
			}else {
				arData5[i]=i;
			}
			
		}
		System.out.println("\n");
		System.out.println(total);
		
		// 메인 끝
	}
}



// 1
//String input2 = null, message2 = "정수를 입력하세요.\nex)1024",
//    result2 = "", hangle = "공일이삼사오육칠팔구";
//System.out.println(message2);
//input2 = sc.nextLine();
//
//for(int i = 0; i < input2.length(); i++) {
// result2 += hangle.charAt(input2.charAt(i) - 48);
//}
//System.out.println(result2);

//for(int i = 0; i < input2.length(); i++) {
// int c = input2.charAt(i) - 48;











