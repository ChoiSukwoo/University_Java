package week4;

public class StringEx {

	public static void main(String[] args) {
		String a = "Hellow";
		String b = "Java";
		String c = "Hellow";
		
		if (a.equals(c)) {
			System.out.println("a�� c�� ���� ��ü�̴�");
		}else {
			System.out.println("a�� c�� �ٸ� ��ü�̴�");
		}
		
		if (a==c) {
			System.out.println("a�� c�� ���� �ּҰ�");
		}

		System.out.println("====================================");

		String d = new String("Hellow");
		String e = new String("Java");
		String f = new String("Jave");
		
		if (e.equals(f)) {
			System.out.println("e/f�� ���� ��ü");
		}else {
			System.out.println("e/f�� �ٸ� ��ü");
		}
		
		if (e==f) {
			System.out.println("e/f�� ���� �ּҰ�");
		}else {
			System.out.println("e/f�� �ٸ� �ּҰ�");	
		}
	}
}
