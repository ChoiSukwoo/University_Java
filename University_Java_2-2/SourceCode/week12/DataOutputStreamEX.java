package week12;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DataOutputStreamEX {

	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("data.txt");
		BufferedOutputStream bos = new BufferedOutputStream(out);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.write(23);
		dos.writeDouble(12.34);
		dos.writeBytes("ABCDEFG!!");
		
		dos.close();
		bos.close();
		out.close();
	}
}
