package lambdaTask;

import lambdaTest.CalcResult;
import lambdaTest.LambdaInter2;

public class LambdaTask {
   public static void main(String[] args) {
	   
	   
//      LambdaInter2 구현하기
//      두 정수를 받아서 사칙연산을 CalcResult로 리턴해주는 메서드
	   // CalcResult에 가서 + ,-,
	  int result1 = 0;
	  int result2 = 0;
	  int result3 = 0;
	  int result4 = 0;
      LambdaInter2 lambdaInter2 = (int num1, int num2) -> {
    	  CalcResult c = new CalcResult(); // 객체 만들기
    	  c.setAdd(num1+num2);
    	  c.setDivide(num1+num2);
    	  c.setMul(num1*num2);
    	  c.setSubstract(num1/num2);
    	  return c;
      };
      
      
      CalcResult cr = lambdaInter2.calc(10, 2);
      System.out.println(cr.getAdd());
      


    	  
 //   사칙연산의 결과를 출력하는 메서드
     
      
      
   }
}
