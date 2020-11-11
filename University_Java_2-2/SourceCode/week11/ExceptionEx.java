package week11;

//예외처리
public class ExceptionEx {
	public static void main(String[] args) {
		try {
			
			int[] arr = new int[3];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
//			arr[3] = 100;
		} catch (Exception e) {
			System.out.println("배열오류");			 
		}
		System.out.println("정상종료");

	}
}
