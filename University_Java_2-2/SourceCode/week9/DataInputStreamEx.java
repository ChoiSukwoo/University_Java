package week9;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataInputStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("data.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		FileInputStream fis = new FileInputStream("data.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		dos.writeInt(23);
		dos.writeDouble(12.34);
		dos.writeBytes("ABCDE!!");
		
		dos.close();
		fos.close();

		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		
		byte[] bb = new byte[10];
		dis.read(bb);
		System.out.println(new String(bb));

		dis.close();
		dos.close();
	}
}
