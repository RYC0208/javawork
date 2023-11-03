package dateCalender;

import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDate03 {
	
	public static void main(String[] args) {
 		LocalDate today =LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear()+"년");
		System.out.println(today.getMonth());		//월을 영문으로 출력
		System.out.println(today.getMonthValue()+"월");
		System.out.println(today.getDayOfMonth()+"일");
		System.out.println("365일 중 " + today.getDayOfYear()+"일");
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfWeek().getValue());// 1;월요일
		System.out.println("이달의 마지막 일: "+ today.lengthOfMonth());
		System.out.println("올해는 총 " + today.lengthOfYear()+"일");
		System.out.println("올해는 윤년인가?: "+today.isLeapYear());
		
		LocalDate endDay = LocalDate.of(2024, 5, 2);
		System.out.println(endDay);
		Period p = today.until(endDay);
		System.out.println(p.getMonths()+"개월"+p.getDays()+"일 남음");
		
		//시간만 얻어오기
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		LocalTime time2 = LocalTime.of(9, 30, 20);
		System.out.println(time2);
		
		Duration d = Duration.between(time2, time);
		System.out.println(d.getSeconds()/60 + "분이 지남");
		//날짜와 시간 모두 얻어오기 
		
		LocalDateTime todayNow = LocalDateTime.now();
		System.out.println(todayNow);
		
		ZonedDateTime seoulDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDT);
		ZonedDateTime newYorkDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newYorkDT);
		int n1 = 114;
		
		String tall = (n1 >= 120) ? "키가 "+n1+"cm 이므로 탑승 가능합니다" : "키가 "+n1+"cm 이므로 탑승이 불가합니다";
		System.out.println(tall);
		
		
		
		
		
	}
	
}
