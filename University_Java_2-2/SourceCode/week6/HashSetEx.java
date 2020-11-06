package week6;

import java.util.HashSet;
import java.util.TreeSet;

class Player implements Comparable{
	private String name;
	private String nation;

	public Player(String name, String nation) {
		this.name = name;
		this.nation = nation;
	}

	public String toString() {
		return name+":"+nation;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Player) {
			Player p = (Player) obj;
			return this.name.equals(p.name) && this.nation.equals(nation);
		}
		return false;
	}
	
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public int compareTo(Object o) {
		Player obj = (Player) o;
		// TODO Auto-generated method stub
		return this.name.compareTo(obj.name);
	}
}

public class HashSetEx {
	public static void main(String[] args) {

		HashSet<Player> set = new HashSet<Player>();
		Player p1 = new Player("Kim", "Korean");
		Player p2 = new Player("Kim", "Korean");
		Player p3 = new Player("Lee", "Korean");
		Player p4 = new Player("Ahn", "Korean");

		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println("Á¤·Ä-------------");
		TreeSet<Player> test = new TreeSet<Player>();
		test.add(p1);
		test.add(p2);
		test.add(p3);
		test.add(p4);
		System.out.println(test);
		
	}
}