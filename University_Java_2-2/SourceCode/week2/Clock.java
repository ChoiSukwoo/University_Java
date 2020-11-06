package week2;

public interface Clock {
	public static final int ONEDAY = 24;
	public abstract int getMinute();
	public abstract int getHour();
	public abstract int setMinute(int minute);
	public abstract int setHour(int hour);
}
