package week7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


//c:\\Temp\\aaa.txt ������ ���� ��ġ�� copy.text
//����Ʈ / ����
// ���⼭�� ���ܸ� ó�������ʰ� ����
//Exception = IOException - FileNotFound Exception 

public class FileCopyEx {
	public static void main(String[] args) throws Exception {
		
		//1.������ ��ġ���� = ��Ʈ�� ����
		InputStream in = null;
		OutputStream out = null;

		in = new FileInputStream("C:\\Temp\\aaa.txt");
		out = new FileOutputStream("Copy.txt");
		
		
		while (true) {
			int data = in.read();
			if (data == -1) {
				break;
			}
			out.write(data);
			System.out.print((char)data);
		}
		
	
	}
}
