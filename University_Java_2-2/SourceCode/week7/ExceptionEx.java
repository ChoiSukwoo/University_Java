package week7;

//예외처리
public class ExceptionEx {
	public static void main(String[] args) {
		try {
			
			int[] arr = new int[2];
			arr[0] = 1;
			arr[1] = 2;
//			arr[2] = 3;
			System.out.println("정상종료");
		} catch (Exception e) {
			System.out.println("배열오류");			 
		}

	}
}
