package week7;

import java.util.Scanner;

public class InputMismatchEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("3개의 정수를 입력해 주세요");
		
		int sum = 0,n=0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i+">> ");
			try {
				n = scan.nextInt();
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 정수를 입력하세요");
				scan.next();//현재 입력스트림에 남아있는 토큰을 지운다
				i--;
				continue;
			}
			sum = sum+n;
		}
		System.out.println("합은 : "+ sum);
		scan.close();
	}
}
