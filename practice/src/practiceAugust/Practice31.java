package practiceAugust;
//넷플릭스
//애니메이션, 영화, 드라마 클래스 선언
//애니메이션이라면 "자막 지원" 기능 사용
//영화라면 "4D" 기능 사용
//드라마라면 "굿즈" 기능 사용

//상속 video

class Video {
	String name;
	int time;
	public Video() {;}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	void addFunction() {
		System.out.println("추가 기능");
	}
	
}

class Movie extends Video{
	public Movie() {;}
	
	@Override
	void addFunction() {
		System.out.println("자막추가");
	}
}

class Ani extends Video{
	public Ani() {;}
	
	@Override
	void addFunction() {
		System.out.println("굿즈 증정");
	}
}

class User{
	String name;
	int age;
	public User() {
	// TODO Auto-generated constructor stub
	}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 비디오랑 유저 연결해!!!!!!!!!!!!
	void watch(Video video) {
		if(video instanceof Ani) {
			video.addFunction();
		}else if(video instanceof Movie) {
			video.addFunction();
		}
	}
	
}
public class Practice31 {
	public static void main(String[] args) {
		new User().watch(new Movie());
		new User().watch(new Ani());
		
	}
}
