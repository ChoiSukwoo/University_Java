package week9;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderEx {
	public static void main(String[] args) throws Exception {

		// 1)적절한 스트림 선정

		// byte - inputstream - fileinputstream

		FileReader fin = null;
		FileWriter fw = new FileWriter("copy.txt");

		// FileInputStream fin = new FileInputStream("C:\\Temp\\test.txt");

		fin = new FileReader("C:\\Temp\\test.txt");
		// 읽고 쓰기
		while (true) {
			int data = fin.read();
			if (data == -1) {break;}

			System.out.print((char) data);
			fw.write(data);
		}

		// 3) 닫기
		fin.close();
		fw.close();
	}
}
