package week2;

//AndroidPhone 이 가질수 있는 타입의 종류는 몇개인가? => 7개

public class AndroidPhoneEx {
	public static void main(String[] args) {
		AndroidPhone ap = new AndroidPhone(); 	//클래스로 생성
		ISmartPhone ip = new AndroidPhone();	//인터페이스로 생성
		Mp3 mp3 = new AndroidPhone();
		Camera camera = new AndroidPhone();
		Phone phone = new AndroidPhone();
		Internet internet = new AndroidPhone();
		Object object = new AndroidPhone();
	}
}
