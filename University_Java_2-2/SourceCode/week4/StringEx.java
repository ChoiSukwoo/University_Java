package week4;

public class StringEx {

	public static void main(String[] args) {
		String a = "Hellow";
		String b = "Java";
		String c = "Hellow";
		
		if (a.equals(c)) {
			System.out.println("a와 c는 같은 계체이다");
		}else {
			System.out.println("a와 c는 다른 계체이다");
		}
		
		if (a==c) {
			System.out.println("a와 c는 같은 주소값");
		}

		System.out.println("====================================");

		String d = new String("Hellow");
		String e = new String("Java");
		String f = new String("Jave");
		
		if (e.equals(f)) {
			System.out.println("e/f는 같은 계체");
		}else {
			System.out.println("e/f는 다른 계체");
		}
		
		if (e==f) {
			System.out.println("e/f는 같은 주소값");
		}else {
			System.out.println("e/f는 다른 주소값");	
		}
	}
}
