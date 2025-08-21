package arrayTest;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
//      1. 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다.
//      입력 예)안녕hI!!
//      출력 예)안녕Hi!!
      Scanner sc = new Scanner(System.in);
      String message1 = "문자를 입력하세요", input = "";
      System.out.println(message1);
      input = sc.next();
      int inputBig = 0, inputSmall=0;
      
      char inputBigA =' ', inputSmallA=' ';
      char [] arData1 = new char [10];
      char [] arData2 = {'s'};
      int [] arData3 = {1,2};
      // 1번 문제
      // 입력을 받으면 자르자 = 반복문 이용 + 글자 하나 씩 들고 와야함(.charAt(인덱스))
      // 자르고 소대문자를 바꾸자 = 아스키 이용(+-32)
      // 자르고 배열에 넣자 = 반복문 이용
      
      
      for(int i = 0 ; i < input.length() ; i++) {
    	  //System.out.println((int)input.charAt(i));
    	  
          if(96< (int)input.charAt(i) && (int)input.charAt(i)< 123) {
        		inputBig=(int)input.charAt(i)-32;
        		//System.out.println(inputBig);
        		inputBigA=(char)inputBig;
        		arData1[i]=inputBigA;
          }else if(64< (int)input.charAt(i) && (int)input.charAt(i)< 91) {
        	  	inputSmall=(int)input.charAt(i)+32;
        	  	inputSmallA=(char)inputSmall;
        	  	arData1[i]=inputSmallA;
          }else {
        	  	arData1[i]=input.charAt(i);
          }
          
        
      }
      System.out.println(arData1);
      System.out.println(arData3);
      
		
		
		
//      2. 정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사
      // 입력을 하면 하나씩 뜯기
      // 뜯고 맞는 한글로 바꾸기
      // 배열에 넣기
      
		String message2 = "정수를 입력하세요", input2 ="", result2="", hangle="일이삼사오육칠팔구공";
		System.out.println(message2);
		input2 = sc.nextLine();
		for(int i = 0; i<input2.length();i++) {
			result2 +=hangle.charAt(input2.charAt(i) - 48);
		}
	
		
		//////////////////////////////answer//////////////////////////
//      2. 정수를 한글로 변경

		// 1
//      String input2 = null, message2 = "정수를 입력하세요.\nex)1024",
//            result2 = "", hangle = "공일이삼사오육칠팔구";
//      System.out.println(message2);
//      input2 = sc.nextLine();
//      
//      for(int i = 0; i < input2.length(); i++) {
//         result2 += hangle.charAt(input2.charAt(i) - 48);
//      }
//      System.out.println(result2);
      
//      for(int i = 0; i < input2.length(); i++) {
//         int c = input2.charAt(i) - 48;
    
		
	//   2
//         switch (c) {
//         case 1:
//            result2 += "일";
//            break;
//         case 2:
//            result2 += "이";
//            break;
//         case 3:
//            result2 += "삼";
//            break;
//         case 4:
//            result2 += "사";
//            break;
//         case 5:
//            result2 += "오";
//            break;
//         case 6:
//            result2 += "육";
//            break;
//         case 7:
//            result2 += "칠";
//            break;
//         case 8:
//            result2 += "팔";
//            break;
//         case 9:
//            result2 += "구";
//            break;
//         case 0:
//            result2 += "공";
//            break;
//
//         default:
//            result2 += c;
//            break;
		
		
		
		
		
		
		
      	
		// main 끝
	}
}
