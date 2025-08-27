package abstractTest;

// 인터페이스 = 타입이다.
//  대문자


public class Dog implements Pet{
 @Override
 public void hand() {
 	System.out.println("패드");
 }
 @Override
 	public void sitDown() {
 	System.out.println("강아지 앉아");
 }
 @Override
 	public void waitNow() {
 	System.out.println("강아지 기다려");
 }

}
