package week4;
import java.util.Calendar;


public class CalenderEx4 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		long today = cal.getTimeInMillis();
		System.out.println("���� ��¥ : " + cal.get(Calendar.YEAR)+"��"+cal.get(Calendar.MONTH)+"��"+cal.get(Calendar.DATE)+"��");
		
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 6);
		cal.set(Calendar.DATE, 21);

		System.out.println("���� ��¥ : " + cal.get(Calendar.YEAR)+"��"+cal.get(Calendar.MONTH)+"��"+cal.get(Calendar.DATE)+"��");
		
		long birthday = cal.getTimeInMillis();

		long gap = birthday - today;

		System.out.println("���� ��¥ : " + gap / (1000 * 60 * 60 * 24));
		
		int youl = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (youl) {
		case 1:
			System.out.println("�Ͽ���");
			break;
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("ȭ����");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("�����");
			break;
		case 6:
			System.out.println("�ݿ���");
			break;
		case 7:
			System.out.println("�����");
			break;
		}
	}
}