package week7;

import java.util.Scanner;

public class DividedByZero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int divided;
		int divisor;
		while (true) {
			try {
				System.out.print("�������� �Է��ϻ���. >> ");
				divided = scan.nextInt();
				System.out.print("�������� �Է��ϼ���. >> ");
				divisor = scan.nextInt();
				
				System.out.println(divided+"�� " +divisor+"���� ������ ���� : " + (divided/divisor) +"�Դϴ�");
				break;
			} catch (ArithmeticException e) {
				System.out.println("0���� ������ �����ϴ�. �ٽ� �Է��ϼ���");
			}
		}
		
			scan.close();		
		
	}
}
 