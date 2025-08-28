package lambdaTask.copy;
//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//  인터프리터에서 아무것도 안 받음 return = void
// 10까지 출력을 어디에 적을지 


//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
//3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
//5) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
public class LambdaTask2 {
	public static void main(String[] args) {
		//1.
		// 추상 안됨 =>  interpeter 값이 없어서 
		LambdaInter lambdaInter = () -> {
			for(int i = 0; i<10; i++) {
				System.out.print(i+1+" ");
			};
			
		};
		//2.
		// 문자열과 문자형
		// (cat, String) => 3개
		//문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
		//String PrintString(String result2);int strCount(int num2);
		// equals(findC) => 문자열만 비교 !!
		LambdaInter2 lambdaInter2 = (String result, char c) -> {
			int count = 0;
			count = result.length();
			System.out.println(count);
		};
		
		//3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 public void reverseString(String result3);
		// cat => tac 012 210
		// 람다식 분법은 생성자와 객체화를 동시에
		// new Lambda => 생성자 생략 == 아래는 객체화 하는 것
		LambdaInter3 lambdaInter3 = (String result3) -> {
			for(int i =0; i < result3.length(); i++) {
				char reverse = ' ';
				reverse = result3.charAt(result3.length() -i -1);
				System.out.print(reverse);
			}
		};
		
		//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현  void removeStr(String result4, char c);
		LambdaInter4 lamb4 = (String result4, char c) -> {
			// 문자열을 다 뜯어서 char로 만들기 반복문
			//그 것과 동일한 char 찾기 반복문 ==> 같으면 continue
			// 메서드 사용
			System.out.println(result4.replaceAll(String.valueOf(c), ""));
			
		};
		
		
		
		
		
		//결과
		lambdaInter.printNum();
		System.out.println("\n");
		//lambdaInter2.strCount("sing", "String");
		System.out.println("\n");
		lambdaInter3.reverseString("cat");
		System.out.println("\n");
		lamb4.removeStr("string", 's');
		
		
		
	}

}
