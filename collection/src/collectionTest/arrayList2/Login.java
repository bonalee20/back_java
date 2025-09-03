package collectionTest.arrayList2;

public class Login {
	public static void main(String[] args) {
		UserField userfeild = new UserField();
		
		
		
		User user = new User("bona", "이영서", "123", "01028880008");
		userfeild.join(user);
		System.out.println(DBconnecter.users);
		
		
		User userForLogin = new User("bona", "이영서", "123", "01028880008");
		if(userfeild.login(userForLogin)) {
			System.out.println("성공");
		}
		
		// 비밀번호 변경
		userForLogin.setPassword("12");
		System.out.println(userForLogin);
		
		//로그아웃
		userfeild.logout();
		System.out.println(userfeild.userId);
		
	}
}
