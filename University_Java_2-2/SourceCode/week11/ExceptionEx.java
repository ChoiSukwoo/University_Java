package week11;

//����ó��
public class ExceptionEx {
	public static void main(String[] args) {
		try {
			
			int[] arr = new int[3];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
//			arr[3] = 100;
		} catch (Exception e) {
			System.out.println("성공");			 
		}
		System.out.println("실패");

	}
}
