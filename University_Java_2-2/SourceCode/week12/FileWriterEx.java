package week12;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:\\Temp\\text.txt");
		int c;
		
		while (true) {
				
			String line = scan.nextLine();
			
			if(line.length()==0) {
				break;
			}
			
			fw.write(line,0,line.length());
			fw.write("\r\n",0,2);
		
		}
		
		scan.close();
		fw.close();
		
	}
}
