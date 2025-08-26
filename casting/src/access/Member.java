package access;


// 이름, 주소 ,나이
public class Member {
	// 1. 필드
	private String name;
	private String address;
	private int age;
	
	//2. 기본 초기화
	public Member() {;}

	//3.초기화
	public Member(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	// 4. 프라이빗 붙이기 alt shift s => R (generate setter) => alt + A => R

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	




	
	
	
}
