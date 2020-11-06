package week3;


class point20 {
	private int x, y;

	public point20(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return x+":"+y;
	}
	
	public boolean equals(Object obj) {
		point20 p = (point20)obj;
		if(x == p.x && y ==p.y) {
			return true;
		}else {
			return false;
		}
	}
}


public class EqualEx {
	public static void main(String[] args) {
		point20 p = new point20(2, 3);
		point20 p1 = new point20(2, 3);

		System.out.println(p.equals(p1));
		
		point20 p2 = new point20(4, 5);

		System.out.println("p,p2 ºñ±³ : " + p.equals(p2));
	}

}
