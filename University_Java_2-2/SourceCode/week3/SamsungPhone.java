package week3;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("�츮������");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �ӽ��ϴ�.");
	}
	
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �Ѡ����ϴ�.");
	}
	
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.sendCall();
		phone.prubtLogo();
		phone.receiveCall();
		phone.flash();
	}
}
