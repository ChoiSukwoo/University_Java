package week11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx {


	public static void main(String[] args) throws Exception {
		
		//1. 적절한 입출력 스트림 추가
		//InputStream in = null;
		//OutputStream out = null;
		//in = new FileInputStream("C:\\aaa.txt");
		//out = new FileOutputStream("Copy.txt");
		
		FileReader in = new FileReader("C:\\aaa.txt");
		FileWriter out= new FileWriter("Copy.txt");
		
		//2.�̰� ���� ����
		while (true) {
			int data = in.read();
			if (data == -1) {
				break;
			}
			
			System.out.print((char)data);
			out.write(data);
		}
		
		//3.�ݱ�
	}
}
