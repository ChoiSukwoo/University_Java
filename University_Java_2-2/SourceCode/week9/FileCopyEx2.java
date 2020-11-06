package week9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopyEx2 {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:\\Temp\\tokyo.png");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		byte[] buffer = new byte[1024];

		long start = System.currentTimeMillis();

		while (true) {
			int count = fis.read(buffer);
			if (count == -1) {
				break;
			}
			fos.write(buffer, 0, count);
		}

		long end = System.currentTimeMillis();

		System.out.println(" ���� �ð� : " + (end - start));
		fis.close();
		fos.close();

	}
}