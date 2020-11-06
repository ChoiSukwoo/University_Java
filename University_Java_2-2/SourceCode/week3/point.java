package week3;

public class point {

	private int x, y; // 한점을 구성하는 x,y좌표

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
