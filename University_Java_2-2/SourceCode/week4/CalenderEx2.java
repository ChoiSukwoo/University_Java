package week4;

import java.util.Calendar;

public class CalenderEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		System.out.println("���� ��¥ : " + year+"��"+month+"��"+date+"��");
		
		cal.set(Calendar.YEAR, 2019);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);

		int DayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("���� : " + DayOfWeek);
	}
}
