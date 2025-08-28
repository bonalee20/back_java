package anonymousTask2;

public class AnonymousTask2 {
	public static void main(String[] args) {
//		메서드 선언
		MyInter myInter = new MyInter() {
			
			@Override
			public void getString(String content) {
				char[] chars = content.toCharArray();
				for(char c: chars) {
					System.out.print((char)(c > 66 ? c + 1 : c));
				}
			}
			
			@Override
			//A = 65,a = 97
			public void changeUpperOrLower(String content) {
				for(int i = 0; i < content.length();i++) {
					char c = content.charAt(i);
					if(c>64 && c<91) {
						c = (char)(c + 32);
						System.out.print(c);
					}else if(c>96) {
						c = (char)(c - 32);
						System.out.print(c);
					}
				}
				
				
			}
		};
		
//		메서드 사용
		myInter.getString("ABCD");
		System.out.println("\n");
		myInter.changeUpperOrLower("aAnd");
		
	}
}
