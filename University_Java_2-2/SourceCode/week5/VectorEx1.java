package week5;

import java.util.HashSet;
import java.util.Vector;

class Point {
	
	private int x, y; // 한점을 구성하는 x,y좌표

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "( " + x + "," + y + ")";
	}
	
	//equals 오버라이딩
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point p = (Point) obj;
			return this.x == p.x && this.y== p.y;
		}
		return false;
	}

	//hashCode 오버라이딩
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime*result+x;
		result = prime*result+y;
		return result;
	}

}

public class VectorEx1 {

	public static void main(String[] args) {

		HashSet<Point> set = new HashSet<Point>();
		set.add(new Point(2, 3));
		set.add(new Point(10, 20));
		set.add(new Point(2, 3));
		set.add(new Point(-1, 3));

		for (int i = 0; i < set.size() ; i++) {
			Object[] obj = set.toArray();
			System.out.println(obj[i]);
		}
		
		Point p = new Point(2, 3);
		Point p1 = new Point(2, 3);
		
		System.out.println(p.equals(p1));
		
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		
	
//		Vector<Point> v = new Vector<Point>();
//
//		v.add(new Point(2, 3));
//		v.add(new Point(-5, 20));
//		v.add(new Point(30, -8));
//
//		v.remove(1);
//		
//		for (int i = 0; i < v.size() ; i++) {
//			Point p = v.get(i);
//			System.out.println(p);
//		}

	}
}
