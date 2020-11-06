package week5;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratorEx3 {
	public static void main(String[] args) {
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.add("aaaa");
		tSet.add("kkkk");
		tSet.add("zzzz");
		tSet.add("cccc");
		
		Iterator it = tSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
