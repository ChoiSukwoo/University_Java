package week7;

import java.io.FileReader;
import java.io.FileWriter;


//����Ʈ
//���� ������ �ѱ�
public class FileReaderEx {
	public static void main(String[] args) throws Exception {
		// 1.������ ��ġ���� = ��Ʈ�� ����
		FileReader fr = new FileReader("C:\\Temp\\aaa1.txt");
		FileWriter fw = new FileWriter("Copy.txt");
		
		//2.�а���
		while (true) {
			int data = fr.read();
			
			
			if(data == -1)
				break;
			fw.write(data); 
			System.out.print((char)data);
		}
		
		//3.�ݱ⾲��
		fr.close();
		fw.close();
	
	}
}
