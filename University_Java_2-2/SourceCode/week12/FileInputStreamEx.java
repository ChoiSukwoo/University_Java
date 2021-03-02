package week12;

import java.io.FileInputStream;

public class FileInputStreamEx {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("test.txt");

		//6바이트 짜리 배열 생성
		byte b[] = new byte[6];
		int c,n=0;

		while ((c = in.read()) != -1) {
			//바이트 단위로 값을 읽어와서 배열에 삽입
			b[n] = (byte)c;
			n++;
		}
		
		for (int i = 0; i < b.length; i++) {
			//배열 출력
			System.out.println(b[i]);
		}
		in.close();

	}
}
