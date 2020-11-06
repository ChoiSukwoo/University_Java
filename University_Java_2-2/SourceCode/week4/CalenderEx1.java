package week4;

import java.util.Calendar;

public class CalenderEx1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("오늘날짜 : " + year + "-" + month + "-" + date);
		System.out.println("현재시간 : " + hour + ":" +minute + ":" + second);
	}
}
