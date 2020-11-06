package week9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
	public static void main(String[] args) throws Exception {

		InputStreamReader in = null;
		FileInputStream fis = null;

		fis = new FileInputStream("C:\\Temp\\hangul.txt");
		in = new InputStreamReader(fis, "MS949");

		System.out.println("ÀÎÄÚµù : " + in.getEncoding());

		while (true) {
			int count = in.read();
			if (count == -1) {
				break;
			}
			System.out.print((char) count);
		}

		in.close();
		fis.close();

	}
}