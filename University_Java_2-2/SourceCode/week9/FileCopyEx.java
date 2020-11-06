//byte : InputStream - FileInputStream ,OutputStream - FileOutputStream

package week9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Temp\\tokyo.png");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		
		long start = System.currentTimeMillis();
		while(true) {
			int data = fis.read();
			
			if(data== -1) {
				break;
			}
			
			fos.write(data);
		}

		long end = System.currentTimeMillis();
		System.out.println(" 복사 시간 : " + (end - start));
		fis.close();
		fos.close();
	
	}
}
