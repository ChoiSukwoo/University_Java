package week7;

import java.util.Scanner;

public class InputMismatchEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("3���� ������ �Է��� �ּ���");
		
		int sum = 0,n=0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i+">> ");
			try {
				n = scan.nextInt();
			} catch (Exception e) {
				System.out.println("������ �ƴմϴ�. ������ �Է��ϼ���");
				scan.next();//���� �Է½�Ʈ���� �����ִ� ��ū�� �����
				i--;
				continue;
			}
			sum = sum+n;
		}
		System.out.println("���� : "+ sum);
		scan.close();
	}
}
