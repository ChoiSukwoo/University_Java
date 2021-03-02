package week11;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<PlayerVO> tSet = new TreeSet<PlayerVO>();

		tSet.add(new PlayerVO("이름1", "1루수", 1993));
		tSet.add(new PlayerVO("이름2", "2루수", 2001));
		tSet.add(new PlayerVO("이름3", "3루수", 2010));
		tSet.add(new PlayerVO("이름4", "외야수", 2005));
		
		System.out.println(tSet);
	}
}
