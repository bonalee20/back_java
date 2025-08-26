package castingTask3;
//넷플릭스
//애니메이션, 영화, 드라마 클래스 선언
//애니메이션이라면 "자막 지원" 기능 사용
//영화라면 "4D" 기능 사용
//드라마라면 "굿즈" 기능 사용

//상속 video



public class CastingTask3 {
	public static void main(String[] args) {
		new User().watch(new Movie());
		new User().watch(new Drama());
		new User().watch(new Animation());
	}
}
