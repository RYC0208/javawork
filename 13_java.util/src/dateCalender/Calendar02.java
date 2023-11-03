package dateCalender;

import java.util.Calendar;

public class Calendar02 {

	public static void main(String[] args) {
		Calendar today =Calendar.getInstance();
		System.out.println("현재년도: "+today.get(Calendar.YEAR));
		System.out.println("현재월: "+(today.get(Calendar.MONTH)+1));
		System.out.println("현재일: "+(today.get(Calendar.DATE)));
		
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		String[] weeks = {"일","월","화","수","목","금","토"};
		System.out.println(weeks[today.get(Calendar.DAY_OF_WEEK)-1]+"요일");
		
		Calendar date = Calendar.getInstance();
		date.set(2021, 11, 03);
		System.out.println(date.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.YEAR)-date.get(Calendar.YEAR));
		/*switch(week) {
		
		case 1:
			System.out.println("일요일");
			break;
		case 2:
		}*/

	}
}
