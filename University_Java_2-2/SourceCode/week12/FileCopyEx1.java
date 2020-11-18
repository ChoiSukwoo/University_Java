package week12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Temp\\test.png");
		FileOutputStream fos = new FileOutputStream("copy.png");
		byte[] buffer = new byte[1024*10];
		long start = System.currentTimeMillis();
		while (true) {
			int count = fis.read(buffer);
			if (count == -1) {break;}
			fos.write(buffer, 0, count);
		}
		long end = System.currentTimeMillis();
		System.out.println(" 걸린시간 : " + (end - start));
		fis.close();
		fos.close();

	}
}