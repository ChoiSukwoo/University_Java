package week9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Temp\\aaa1.txt");
		FileOutputStream fos = new FileOutputStream("aaa2.txt");
		byte[] buffer = new byte[5];
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int count = fis.read(buffer);
			if(count == -1) {
				break;
			}
			fos.write(buffer);
		}		
		
		long end = System.currentTimeMillis();
		
		System.out.println(" 복사 시간 : " + (end - start));
		fis.close();
		fos.close();
	
	}
}