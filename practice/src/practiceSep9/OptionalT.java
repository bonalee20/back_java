package practiceSep9; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional; 

public class OptionalT {
	
	// users라는 ArrayList<User9> 초기화
	// Arrays.asList()를 이용해 세 명의 User9 객체를 리스트에 담음
	ArrayList<User9> users = new ArrayList<User9> (Arrays.asList(
			new User9("이영서", "bon", "1234"),
			new User9("홍길동", "l", "1234"),
			new User9("이영", "e", "1234")
			));
	

	public Optional<User9> findById(Long id){
		User9 user = null;
		
		// for-each문으로 users 리스트를 순회하면서 id가 같은 객체를 찾음
		for(User9 userInDb:users) {
			if(userInDb.getId() == id) {
				user = userInDb; // 찾으면 user 변수에 저장
			}
		}
		
		// user가 null일 수도 있으므로 Optional로 감싸서 반환
		return Optional.ofNullable(null);
	}
	
	
	
	
	public static void main(String[] args) {
		OptionalT ot = new OptionalT();

		
		
		
	}
}
