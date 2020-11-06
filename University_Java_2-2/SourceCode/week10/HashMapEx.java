package week10;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1,"Kim");
		map.put(2, "Lee");
		map.put(2, "Park");
		map.put(3, "Kim");
		map.put(5, "Choi");
		
		System.out.println(map);
		
		java.util.Set<Integer> keySet = map.keySet();
		Iterator iterator = keySet.iterator();
		
		while (iterator.hasNext()) {
			Integer num = (Integer) iterator.next();
			System.out.println(num + ":" + map.get(num));
		}
	
	}
}
