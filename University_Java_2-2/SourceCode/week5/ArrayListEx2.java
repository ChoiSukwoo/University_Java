package week5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(-1);
		list.add(2, 100);

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}

		// Iterator를 이용해 모든 정수 더하기
		int sum = 0;
		it = list.iterator();
		while (it.hasNext()) {
			int n = it.next();
			sum = sum + n;
		}
		System.out.println("ArrayList에 있는 정수의 합 : " + sum);
	}
}
