package week12;

import java.io.FileReader;

public class FileReaderEX {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Temp\\text.txt");

		int c;

		while ((c = fr.read()) != -1) {
			System.out.print((char) c);
		}
		fr.close();

	}
}
