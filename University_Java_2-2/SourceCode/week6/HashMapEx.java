package week6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("Baby", "아기");
		dic.put("love", "사과");
		dic.put("apple", "사과");
		
		Set<String> key = dic.keySet();
		Iterator it = key.iterator();
		while (it.hasNext()) {
			String eng = (String) it.next();
			String kor =  dic.get(eng);
			System.out.println(eng + ":" + kor);
			}
		
		
		//사용자로부터 영단어를 입력받고 한글단어 검색
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("찾고싶은단어 : ");
			String eng = scan.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			
			String kor = dic.get(eng);
			
			if(kor == null) {
				System.out.println(eng+"는 없는 단어 입니다.");
			}else {
				System.out.println(kor);
			}
		}
		scan.close();
	}

}
