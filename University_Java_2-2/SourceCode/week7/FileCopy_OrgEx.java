package week7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy_OrgEx {
	public static void main(String[] args) throws Exception {
		
		//1.������ ��ġ���� = ��Ʈ�� ����
		FileInputStream in = null;
		FileOutputStream out = null;

		try {

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
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}catch (IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	
	
	}
}
