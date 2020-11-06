package week7;

import java.util.Scanner;

public class DividedByZero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int divided;
		int divisor;
		while (true) {
			try {
				System.out.print("나뉨수를 입력하새요. >> ");
				divided = scan.nextInt();
				System.out.print("나눔수를 입력하세요. >> ");
				divisor = scan.nextInt();
				
				System.out.println(divided+"를 " +divisor+"으로 나누면 몫은 : " + (divided/divisor) +"입니다");
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다. 다시 입력하세요");
			}
		}
		
			scan.close();		
		
	}
}
 