package week7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


//c:\\Temp\\aaa.txt 파일을 현재 위치에 copy.text
//바이트 / 문자
// 여기서는 예외를 처리하지않고 전가
//Exception = IOException - FileNotFound Exception

public class FileCopyEx {
	public static void main(String[] args) throws Exception {
		
		//1.적절한 장치연결 = 스트림 선정
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
