package week3;

public interface PhoneInterface {
	public static final int TIMEOUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public default void prubtLogo() {
		System.out.println("** pone **");
	}
}


