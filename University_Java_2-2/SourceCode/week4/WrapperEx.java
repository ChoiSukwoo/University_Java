package week4;

public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4',c2='F';
		if (Character.isDigit(c1)) {
			System.out.println(c1+"�� ����");		
		}
		if (Character.isAlphabetic(c2)) {
			System.out.println(c2+"�� ����");		
		}

		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.toHexString(28));
		System.out.println(Integer.toBinaryString(28));
		System.out.println("������ �ִ밪 : " + Integer.MAX_VALUE);
		System.out.println("������ �ּҰ� : " + Integer.MIN_VALUE);
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		
		Boolean b = 4>3;
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
		
	}

}
