package week2;

abstract class AAA{
	{
		System.out.println("AAA");
	}
	int x = 10;
	public void doA() {
		System.out.println("AAA doA");
	}
	public abstract void doB();
}


public class BBB extends AAA {
	{
		System.out.println("BBB");
	}
	int x = 100;
	int y =200;
	@Override
	public void doB() {
		System.out.println ("x1 : " + super.x);
		System.out.println ("x2 : " + this.x);
		System.out.println ("x3 : " + x);
	}
	
	public void doC() {
		System.out.println("CCC");
	}
	
	public static void main(String[] args) {
		BBB bp = new BBB();
		//AAA ap = new AAA();  추상클래스는 단독으로 객체생성 불가능
		bp.doB();
		
		AAA aap = new BBB();
		//aap.doC()  BBB를 할당햇으나 자신의 형식이 AAA여서 실행불가
		BBB bbp = (BBB)aap;
		
		bbp.doC();
		//bp 객체가 접극할수 있는 맴버수
		//object 9개 + 자신의 4개 + 부모의1개 = 14개 
		//BBB 4개  AAA 3개
	}
	
}
