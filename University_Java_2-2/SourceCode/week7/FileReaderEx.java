package week7;

import java.io.FileReader;
import java.io.FileWriter;


//바이트
//문자 데이터 한글
public class FileReaderEx {
	public static void main(String[] args) throws Exception {
		// 1.적절한 장치연결 = 스트림 선정
		FileReader fr = new FileReader("C:\\Temp\\aaa1.txt");
		FileWriter fw = new FileWriter("Copy.txt");
		
		//2.읽고쓰기
		while (true) {
			int data = fr.read();
			
			
			if(data == -1)
				break;
			fw.write(data); 
			System.out.print((char)data);
		}
		
		//3.닫기쓰기
		fr.close();
		fw.close();
	
	}
}
