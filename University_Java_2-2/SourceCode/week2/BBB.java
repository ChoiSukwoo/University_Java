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
		//AAA ap = new AAA();  �߻�Ŭ������ �ܵ����� ��ü���� �Ұ���
		bp.doB();
		
		AAA aap = new BBB();
		//aap.doC()  BBB�� �Ҵ������� �ڽ��� ������ AAA���� ����Ұ�
		BBB bbp = (BBB)aap;
		
		bbp.doC();
		//bp ��ü�� �����Ҽ� �ִ� �ɹ���
		//object 9�� + �ڽ��� 4�� + �θ���1�� = 14�� 
		//BBB 4��  AAA 3��
	}
	
}
