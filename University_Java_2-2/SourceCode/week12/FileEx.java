package week12;

import java.io.File;
import java.sql.Struct;

public class FileEx {
	public static void main(String[] args) {
		File f = new File("FileEx.java");

		System.out.println("파일 이름 : " + f.getName());
		System.out.println("파일 경로 : " + f.getAbsolutePath());
		System.out.println("수정 일자 : " + f.lastModified());
		System.out.println("부모 : " + f.getParent());
		
		File f1 = new File("C:\\Temp");
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		
		File[] subfile = f1.listFiles();
		
		for (int i = 0; i < subfile.length; i++) {
			System.out.println(subfile[i].getName());
		}
		
		String res="";
		
		File f2 = new File("C:\\windows\\system.ini");
		if(f2.isFile()) {
			res = "파일";
		}else if(f2.isDirectory()) {
			res = "디레토리";
		}
		
		System.out.println(f2.getName() + "은" + res + "입니다.");
		
		File f3 = new File("C:\\Temp\\java_sample");
		if(!f3.exists()) {//디렉토리가 없으면 생성
			f3.mkdir();
		}
		
		listDirectory(new File("c:\\Temp"));
		f3.renameTo(new File("C:\\Temp\\javasample"));
		
		listDirectory(new File("c:\\Temp"));
		
	}
	
	
	
	public static void listDirectory(File dir) {
	
		System.out.println("------------" + dir.getPath() + "------------");
		File[] subfile = dir.listFiles();
		for (int i = 0; i < subfile.length; i++) {
			File f = subfile[i];
			long t = f.lastModified(); // 마지막 수정일
			System.out.println(f.getName());
			System.out.print("\t 파일크기 : " + f.length());
			System.out.printf("\t 수정한 시간 : %tb %tb %ta %tT\n",t,t,t,t );
		}
		
		
		
	}
	
	
	
}
