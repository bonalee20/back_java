package lambdaTest;

public class LambdaTest {
   public static void main(String[] args) {
	 //중괄호가 없으면 리턴 없음
      LambdaInter lambdaInter = (num1, num2) -> { System.out.println(num1 + num2);};
      lambdaInter.printAddResult(10, 20);

      LambdaInter2 lambdaInter2 = (num1, num2) -> new CalcResult();
      LambdaInter2 lambdaInter22 = (num1, num2) -> { return new CalcResult();};
      
      LambdaInter3 lambdaInter3 = num -> num % 2 == 0;
      
   }
}


// 2 리턴이 한 줄이면 중괄호 생략


//3 소괄호가 없으면 매개변수 1개