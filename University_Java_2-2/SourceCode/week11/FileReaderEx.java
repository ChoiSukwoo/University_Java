package week11;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderEx {
	public static void main(String[] args) throws Exception {

		// 1올바른 스트림 연결
		// byte - inputstream - fileinputstream

		FileReader fin = null;
		FileWriter fw = new FileWriter("Copy.txt");

		// FileInputStream fin = new FileInputStream("C:\\Temp\\test.txt");

		fin = new FileReader("C:\\Temp\\text.txt");
		// ����ϱ�
		while (true) {
			int data = fin.read();
			if (data == -1) {break;}

			System.out.print((char) data);
			fw.write(data);
		}

		// 3) �ݱ�
		fin.close();
		fw.close();
	}
}
