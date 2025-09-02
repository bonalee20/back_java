package collectionTest.arrayList2;

import java.util.ArrayList;

public class UserField {
	//DB
	public ArrayList<User> users = DBconnecter.users;
	public static String userId;
	final int KEY = 300; // 상수는 대문자

		
		//아이디 검사 checkId = id를 받아서 db에 아이디가 있는 지 아닌 검사
		public User checkId(String id) {
			for(User user: users) {
				if(user.getId().equals(id)) {
					System.out.println("id 같음");
					return user;
				}
			}
			return null;
		}
		
		//회원 가입
		public void join(User user) {
			// user가 없어야지 회원가입 가능
			User userInDb = checkId(user.getId());
			if(userInDb == null) {
				users.add(user);
			}
		}
		
		//로그인 내가 한거 화면에서 함, 
			//user가 있어야지 , db 중에서 하나를 , 로그인 가능
		public void login(User user) {
			// id 없음
			User userInDb = checkId(user.getId());
			
			if(userInDb == null) {
				System.out.println("회원가입하세요");
			}else {
				// id 있음, db 중에서 하나를
				for(User user1:users) {
					if(user.getId().equals(user1.getId())) {
						// id 같음 => 비밀번호 같은지 확인
						if(user.getPassword().equals(user1.getPassword())) {
							System.out.println("로그인 성공");
						}else {
						// id 같음 => 비밀번호 데이터 베이스에서 다름
							System.out.println("비밀번호를 확인하세요");
						}
					}else {
						System.out.println("아이디를 다시 확인 하세요");
					}
				}
			}
			
		}
		
		// 로그인
		public boolean loginT(User user) {
			User userInDb = checkId(user.getId());
			if(userInDb != null) {
				if(user.getPassword().equals(user.getPassword())) {
					userId =userInDb.getId();
					return true;
				}
			}
			return false;
			
		}
		
		//로그아웃 
		public void logout() {
			userId = null;
		}
		
		public User checkPw(String password) {
			for(User user: users) {
				if(user.getPassword().equals(password)) {
					System.out.println("pw 같음");
					return user;
				}
			}
			return null;
		}
		//암호화-> 아스키 코드
		// 비밀번호를 알아볼 수 없게 하기 위해서 암호화 
		// 비밀번호 받으면  > 아스키 코드
		public void encoding(User user) {
			User userInDb = checkPw(user.getPassword());
			if(userInDb != null) {
				for(int i = 0 ;i < user.getPassword().length(); i++) {
					
				}
				//user.getPassword()
			}
		}
		// User user 아님, 회원가입을 시키면서 넘기는 도중의 메서드
		public String encrypt(String password) {
			String encryptPassword = "";
			for(int i = 0 ;i < encryptPassword.length(); i++) {
				encryptPassword += (char)(password.charAt(i)*KEY);
			}
			return encryptPassword;
		}
		
		
		//비밀번호 변경(마이페이지)
		//비밀번호 변경(비밀번호 변경 30일)
		//인증번호 전송 
		//인증번호 생성 
		//인증번호 확인
		
	public static void main(String[] args) {
		UserField uf = new UserField();
		System.out.println(uf.encrypt("Add"));
	}

}
