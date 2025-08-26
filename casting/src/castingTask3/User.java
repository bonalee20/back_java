package castingTask3;

public class User {
	String name;
	int age;
	//
	public User() {;}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//
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
	//
	
	void watch(Video video) {
		if(video instanceof Movie) {
			video.add();
		}else if(video instanceof Drama) {
			video.add();
		}else if(video instanceof Animation) {
			video.add();
		}else {
			
		}
	}
}
