package week12;

import java.io.FileInputStream;

public class FileInputStreamEx {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("test.txt");

		byte b[] = new byte[6];
		int c,n=0;

		while ((c = in.read()) != -1) {
			b[n] = (byte)c;
			n++;
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		in.close();

	}
}
