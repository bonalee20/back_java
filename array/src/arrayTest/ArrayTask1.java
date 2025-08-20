package arrayTest;

import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력
		int [] arData2 = new int[10];
		for(int a=0;a<10;a++) {
			if(a%2==0) {
				arData2[a] =10-a;
			}else {
				continue;
			}
			System.out.println(arData2[a]);
			
		}
		
//      1~10까지 배열에 담고 출력
		int [] arData1 = new int[10];
		for(int i=0;i<10;i++) {
			arData1[i] =i+1;
			System.out.print(arData1[i]);
		}

		System.out.println("\n");
//      1~100까지 배열에 담은 후 홀수만 출력
      int [] arData3 = new int[100];
      for(int b=0;b<100;b++) {
    	  if(b%2==1) {
    		  arData3[b]=b;
    		  System.out.print(arData3[b]);
    	  }
      }
		
		System.out.println("/n 실버");
//      실버
		// 인덱스 0 = 값 1
//      1~100까지 배열에 담은 후 짝수의 합 출력
      int [] arData4 = new int[101];
      int sum = 0;
      for(int c=0;c<101;c++) {
      		arData4[c]=c+1;
      		if(arData4[c]%2==1) {
      			sum +=c;
      		}

      	}
      
  		System.out.println(sum);
      
//      A~F까지 배열에 담고 출력
  		// A = 65
  		char [] arData5 = new char[6];
  		for(int d=0;d<6;d++) {
  			arData5[d]=(char)(d+65);
  			System.out.println(arData5[d]);
  		}
  		
  		
//      A~F까지 중 C제외하고 배열에 담은 후 출력
  		char [] arData6 = new char[6];
  		for(int e=0;e<6;e++) {
  			if(e==2) {
  				continue;
  			}
  			arData5[e]=(char)(e+65);
  			System.out.print(arData5[e]);
  		}
  		
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
  		int [] arData7 = new int[10];
  		Scanner sc = new Scanner(System.in);
  		String message = "\n5개의 정수를 입력하세요 \n ex) 10 20 30 40 50";
  		int min= 0,max =0; 
  		String min1 = "";	
  		System.out.println(message);
  		
  		for(int f=0;f<5;f++) {
  			arData7[f] = sc.nextInt();
  			
  				min = arData7[0];
  				max = arData7[0];
 
  			if(max>arData7[f]) {
	  				max = arData7[f];
	  			}
	  		if(min<arData7[f]) {
	  			min = arData7[f];
  			}
  		
  		}
  		System.out.println(min1+"=최소값");
  		System.out.println(max+"=최대값");
  		
  		
  

//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
      //Scanner sc = new Scanner(System.in);
      int[] arData8 = null;
      String message1 = "정수의 개수: \nex)10";
      int total = 0, length = 0;
      double average = 0.0;
      
      System.out.println(message1);
      length = sc.nextInt();
      arData8 = new int[length];
      
      for(int i = 0; i < arData8.length; i++) {
         System.out.println(i + 1 + "번 째 정수 입력");
         arData8[i] = sc.nextInt();
      }
      
      for(int i = 0; i < length; i++) {
         total += arData8[i];
      }
      
      average = (double)total / length;
      
      System.out.print("[");
      for(int i = 0; i < length; i++) {
         System.out.print(arData8[i]);
         if(i != length - 1) {
            System.out.print(" ");
         }
      }
      System.out.println("]");
      System.out.println("평균: " + average);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
