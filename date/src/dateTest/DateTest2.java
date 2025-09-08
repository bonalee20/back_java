package dateTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTest2 {
	public static void main(String[] args) {
		// 객체화 시키지 마라 캘런더 Calendar calendar = new Calendar();
		Calendar calendar = Calendar.getInstance(); //  싱글턴 = 전역에서 같이 사용하는 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss");
		
		System.out.println(calendar.getTime());
		
		
		
		//프로젝트에 이거 쓰자
		//일자 필요
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
		
	//	LocalDate.parse("1900년 10월 10일", DateTimeFormatter.ofPattern("yyyy년 MM월dd일"));
		
		System.out.println(LocalDate.parse("1900년 10월 10일", DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
	}
}
