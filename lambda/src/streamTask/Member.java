package streamTask;

import java.util.Objects;

// 필드 이름취미소개
public class Member {
	//1.2
	private Long id;
	private String name;
	private String hobby;
	private String introduce;
	private static Long seq;
	
	// 아이디 최초 한 번
	static {
		seq = 0L;
	}
	
	// 생성자가 호출 될 때 마다
	{
		this.id = seq++;
	}
	
	
	
	//3
	public Member() {;}

	public Member( String name, String hobby, String introduce) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.introduce = introduce;
	}
	//4
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
	//5 재정의
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", hobby=" + hobby + ", introduce=" + introduce + "]";
	}
	//6
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
