package week10;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("Kim");
		hashSet.add("Lee");
		hashSet.add("Kim");
		hashSet.add("Park");

		System.out.println(hashSet);
	}
}
