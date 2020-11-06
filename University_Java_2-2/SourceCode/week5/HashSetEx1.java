package week5;

import java.util.HashSet;

//Set : 데이터의중복이 허용 안되고 순서가 없다.
//Genenic : 특정타입의 데이터 저장

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

		//Integer 타입의 데이터만 저장 가능
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(Integer.valueOf(10));
		set.add(123);
		set.add(222);
		
		System.out.println(set);

	}
}
