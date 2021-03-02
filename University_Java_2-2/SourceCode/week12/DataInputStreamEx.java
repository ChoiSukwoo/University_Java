package week12;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DataInputStreamEx {
	public static void main(String[] args) throws Exception {
		//FileInputStream fis = new FileInputStream("data.txt");
		InputStream fin = new FileInputStream("data.txt");
		BufferedInputStream bis = new BufferedInputStream(fin);
		DataInputStream dis = new DataInputStream(bis);

		int a = 0;
		double b = 0.0;
		byte[] c = null;

		a = dis.readInt();
		b = dis.readDouble();
		c = new byte[10];
		dis.read();

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + new String(c));

		dis.close();
		bis.close();
		fin.close();
		
	}
}
