package week4;

import java.util.Calendar;

public class CalenderEx3 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		long today = cal.getTimeInMillis();
		
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);

		long xmas = cal.getTimeInMillis();

		long gap = xmas - today;

		System.out.println((1000 * 60 * 60 * 24));
		System.out.println("남은 날짜 : " + gap / (1000 * 60 * 60 * 24));
	}
}
