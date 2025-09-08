package practiceSep8;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import castingTask3.User;

public class Two {

	ArrayList<One> ones = new ArrayList<One> (Arrays.asList(
			new One("이영서", "bona", "1234"),
			new One("이윤서", "s", "1234"),
			new One("이주서", "bona", "1234")
			));
	
	public Optional<One> findById(Long id){
		One user = null;
		for(One userInDb:ones) {
			if(userInDb.getId() == id) {
				user = userInDb;
			}
		}
		return Optional.ofNullable(user);
	}
	
	
	public static void main(String[] args) {
		Two optionalTest = new Two();
		Optional<One> foundUser = optionalTest.findById(2L);
		One user;
		
		user = foundUser.orElseThrow(()->{
			throw new NoSearchUserException();
		});
		
		
	
		
	}
	
	
	
}
