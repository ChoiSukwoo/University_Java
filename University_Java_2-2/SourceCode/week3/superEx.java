package week3;

class point2 {
	private int x, y; // 한점을 구성하는 x,y좌표

	public point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class colorPoint2 extends point2 {
	private String color;

	public colorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}

public class superEx {
	public static void main(String[] args) {
		colorPoint2 cp = new colorPoint2(5, 6, "Blue");
		cp.showColorPoint();
	}
}
