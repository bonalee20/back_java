package practiceAugust;

//함수형 인터페이스
@FunctionalInterface
interface MyFunction {
 int add(int a, int b);
}

public class LambdaExample {
 public static void main(String[] args) {
     // 익명 클래스 방식
     MyFunction f1 = new MyFunction() {
         public int add(int a, int b) {
             return a + b;
         }
     };

     // 람다식 (익명 함수)
     MyFunction f2 = (a, b) -> a + b;

     System.out.println(f1.add(3, 5)); // 8
     System.out.println(f2.add(10, 20)); // 30
 }
}


