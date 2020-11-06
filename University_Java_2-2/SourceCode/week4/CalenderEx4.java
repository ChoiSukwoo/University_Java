package week4;
import java.util.Calendar;


public class CalenderEx4 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		long today = cal.getTimeInMillis();
		System.out.println("오늘 날짜 : " + cal.get(Calendar.YEAR)+"년"+cal.get(Calendar.MONTH)+"월"+cal.get(Calendar.DATE)+"일");
		
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 6);
		cal.set(Calendar.DATE, 21);

		System.out.println("생일 날짜 : " + cal.get(Calendar.YEAR)+"년"+cal.get(Calendar.MONTH)+"월"+cal.get(Calendar.DATE)+"일");
		
		long birthday = cal.getTimeInMillis();

		long gap = birthday - today;

		System.out.println("남은 날짜 : " + gap / (1000 * 60 * 60 * 24));
		
		int youl = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (youl) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;
		}
	}
}