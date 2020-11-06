package week4;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Math.random();
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println((int)(Math.random()*6+1));
//		}

	
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			int m = r.nextInt(10);
			System.out.println(m);
		}


	}
}
