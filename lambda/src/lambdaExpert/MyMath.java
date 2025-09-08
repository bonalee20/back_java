package lambdaExpert;

import java.util.Scanner;


public class MyMath {
   
//   연산자 1개를 전달 받아서 알맞게 연산하도록 메서드를 구현
   public static Calc calculator(String oper) {
	   if(oper.equals("+"))	{
		   return (num1, num2) -> num1 + num2;
	   }
	   if(oper.equals("-"))	{
		   return (num1, num2) -> num1 - num2;
	   }
      return null;
   }
   
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String message = "식을 입력하세요",input = "";
	   System.out.println(message);
	   input = sc.next();
	   // 공백 제거
	   if((char)input.charAt(0)!='-') {
		   String arr[] = input.split("\\-|\\+");
	   }else {
		   String arr[] = input.replaceFirst("-","").split("\\-|\\+");
		   for(int i =0 ;i < input.replaceFirst("-","").split("\\-|\\+").length; i++) {
			   System.out.println(arr[i]);
		   }
	   // 인덱스와 기호를 붙여야함 
		   //기호를 담자
 
	   }
      
////      전체 수식에서 연산자만 분리하는 람다 메서드 구현
//      OperCheck operCheck = (String result)->{
//    	  String minus="", plus="";
//    	  for(int i = 0; i < result.length(); i++) {
//    		  if(result.charAt(i) == 43) {
//    			  plus +="+";
//    		  }else if(result.charAt(i) == 45) {
//    			  minus +="-";
//    		  }else {
//    			  continue;
//    		  }
//    	  }
//
//    	  System.out.println(plus.split("+"));
//    	  
// 
//    	  System.out.println(minus.replaceFirst("-", "").split("-"));
//    	  return null;
//      };
//      
//      operCheck.getOpers(input);
   }
}
