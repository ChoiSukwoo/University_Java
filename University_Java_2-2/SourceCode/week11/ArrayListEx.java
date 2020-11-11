package week11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		
		list.add(new PlayerVO("홍길동", "1루수", 1993));
		list.add(new PlayerVO("임꺽정", "2루수", 2001));
		list.add(new PlayerVO("강감찬", "포수", 2010));
		list.add(new PlayerVO("을지문덕", "투수", 2005));
		
		System.out.println(list);
		System.out.println("---정렬--");
		Collections.sort(list);
		System.out.println(list);
	}
}
