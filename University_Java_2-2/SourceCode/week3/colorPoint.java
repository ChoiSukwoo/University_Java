package week3;

public class colorPoint extends point {
	private String Color;
	
	public void setColor(String color) {
		this.Color = color;
	}
	public void showColorPoint() {
		System.out.println(Color);
		showPoint();
	}
}
