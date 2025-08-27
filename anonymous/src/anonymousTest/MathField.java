
package anonymousTask;


public class MathField {
   public static void main(String[] args) {
      
//      메서드 구현 후 4개의 메서드 모두 사용
      MathTask mathTask = new MathTask() {
         
         @Override
         public void printName(String name) {
        	 System.out.println(name);
         }
         
         @Override
         public String concat(String str1, String str2) {
        	 System.out.println(str1+str2);
            return null;
         }
         
         @Override
         public CalcResult calc(int num1, int num2) {
        	 CalcResult c = new CalcResult();
        	 c.setAdd(num1+num2);

        	 
            return null;
         }
         
         @Override
         public int add(int num1, int num2) {
            return 0;
         }
         
         
         
      };
      
      
      
      
      
      
   }
}
