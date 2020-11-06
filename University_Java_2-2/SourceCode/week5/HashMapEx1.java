package week5;

import java.util.HashMap;

//Map : 키와 값으로 구성 키는 중복이허용되나 값은 중복이 안됨
public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put("1", "apple");
		map.put("2", "banana");
		map.put("1", "graph");
		map.put("3", "banana");
		map.put("4", "apple");
		map.put("5", "mango");
		
		System.out.println(map);
	}
}
