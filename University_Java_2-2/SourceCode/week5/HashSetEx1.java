package week5;

import java.util.HashSet;

//Set : ���������ߺ��� ��� �ȵǰ� ������ ����.
//Genenic : Ư��Ÿ���� ������ ����

public class HashSetEx1 {
	public static void main(String[] args) {
//		HashSet set = new HashSet<>();
//		set.add("Kim");
//		set.add("Lee");
//		set.add("Kim");
//		set.add("Park");
//		set.add("Choi");
//		
//		set.add(Integer.valueOf(10));
//		set.add(123);
//		set.add(12.5);
//		set.add(10);
//		
//		System.out.println(set);

		//Integer Ÿ���� �����͸� ���� ����
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(Integer.valueOf(10));
		set.add(123);
		set.add(222);
		
		System.out.println(set);

	}
}
