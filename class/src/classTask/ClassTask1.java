package classTask;

import java.util.Scanner;

class Student{
	//필드
	int mathTest = 0;
	int englishTest = 0;
	int koreanTest = 0;
	double average = 0.0;
	int total = 0;
	
	//기본 생성자
	public Student() {;}
	
	//초기화 생성자
	public Student(int mathTest, int englishTest, int koreanTest) {
		this.mathTest = mathTest;
		this.englishTest = englishTest;
		this.koreanTest = koreanTest;
		this.total = mathTest+englishTest+koreanTest;
	}
	
	void printScore() {
		double average = total / 3.0 ;
		System.out.println("총점:"+ total);
		System.out.println("평균:"+ average);
	}
	
	// 왜 void printScore() 안에 mathTest englishTest koreanTest 안 넣어도 되는지
	
}


public class ClassTask1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("수학, 영어, 국어 점수를 입력하세요 \nex) 50 60 70");
//	      클래스이름	 내가정한거 =  초기화 생성자에 값 넣기
			Student user = null;
			int userTest1 =0,userTest2 =0,userTest3=0;
			userTest1 = sc.nextInt();
			userTest2 = sc.nextInt();
			userTest3 = sc.nextInt();
			//  선언은 코드 위에 한다.!!!
			user = new Student(userTest1,userTest2,userTest3);
	//      클래스이름	 내가정한거 =  초기화 생성자에 값 넣기
			user.printScore();
	//      (위에)내가 정한거. 에서 클래스의 메서드(?) 사용
			
			
			//main end
		}
}
