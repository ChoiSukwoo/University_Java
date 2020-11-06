package week10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
	public static void main(String[] args) {

		HashSet<Person> set = new HashSet<Person>();

		set.add(new Person("Kim", 20));
		set.add(new Person("Lee", 21));
		set.add(new Person("Kim", 20));
		set.add(new Person("Park", 22));

		System.out.println(set);
		
		Iterator iterator =set.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	}
}
