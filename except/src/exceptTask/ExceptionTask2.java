package exceptTask;

import java.util.Scanner;

//사용자에게 입력을 받았을 때 특수문자 중 !@#를 사용하면 오류를 발생시키는 로직
//만든 예외를 이용해서 메세지를 출력
public class ExceptionTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "아이디를 입력하세요", input ="";
		System.out.println(message);
		
		input = sc.next();
		
		try {
			if(input.contains("!")) {
				throw new WordNoUse("사용 불가");
			}else if(input.contains("@")) {
				throw new WordNoUse("사용 불가");
			}else if(input.contains("#")) {
				throw new WordNoUse("사용 불가");
			}else {
				System.out.println(input);
			}
		} catch (Exception e) {
			System.out.println("!, @, # 말고 다른 문자를 사용하세요");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
		
	}
}
