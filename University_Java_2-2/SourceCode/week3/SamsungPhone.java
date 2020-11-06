package week3;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왓습니다.");
	}
	
	public void flash() {
		System.out.println("전화기에 불이 켜졋습니다.");
	}
	
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.sendCall();
		phone.prubtLogo();
		phone.receiveCall();
		phone.flash();
	}
}
