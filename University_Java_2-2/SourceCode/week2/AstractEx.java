package week2;


abstract class AA{
	private int X;
	public abstract void doA();
}


class BB extends AA{

	@Override
	public void doA() {
		System.out.println("BB doA()");
	}
	
	public void doB() {
		System.out.println("BB doB()");
	}
	
}

public class AstractEx {
	public static void main(String[] args) {
		BB bp = new BB();
		bp.doA();
		
		AA aap = new BB();
		aap.doA();
		BB bbp = (BB)aap;
		bbp.doB();
	}
}
