package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PlayerVOsortEx {
	private static final String PlayerVO = null;

	public static void main(String[] args) {

		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		list.add(new PlayerVO("홍길동", "투수", 1999));
		list.add(new PlayerVO("임꺽정", "포수", 2005));
		list.add(new PlayerVO("강감찬", "1루수", 2003));
		list.add(new PlayerVO("을지문덕", "2루수", 2010));

		System.out.println(list);
		System.out.println("정렬-------------------------------------------------------------");
		Collections.sort(list);
		System.out.println(list);

		//입단 년도별 정렬
		System.out.println("년도별 정렬--------------------------------------------------------");
		Collections.sort(list,new Comparator<PlayerVO>() {
			@Override
			public int compare(PlayerVO p1, PlayerVO p2) {
				return p1.getReYear() - p2.getReYear();
			}
		});
		System.out.println(list);
		
	}
}
