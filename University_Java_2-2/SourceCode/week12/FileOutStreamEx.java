package week12;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutStreamEx {
	public static void main(String[] args) throws Exception {
		byte b[] = {7,51,3,4,-1,24};
		FileOutputStream out = new FileOutputStream("test.txt");
		for(int i =0;i<b.length;i++) {
			out.write(b[i]);
		}
		out.close();
	}
}
