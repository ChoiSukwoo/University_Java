package week12;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;

public class DataOutputStreamEX {

	public static void main(String[] args) throws Exception {
		
		//바이트 단위로 자르는 스트림
		OutputStream out = new FileOutputStream("data.txt");
		//버퍼링된 출력스트림
		BufferedOutputStream bos = new BufferedOutputStream(out);
		//기본형들을 인식할수 있게해준다
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.write(23);
		dos.writeDouble(12.34);
		dos.writeBytes("ABCDEFG!!");
		
		dos.close();
		bos.close();
		out.close();
	}
}
