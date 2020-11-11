package week11;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<PlayerVO> tSet = new TreeSet<PlayerVO>();

		tSet.add(new PlayerVO("ȫ�浿", "1���", 1993));
		tSet.add(new PlayerVO("�Ӳ���", "2���", 2001));
		tSet.add(new PlayerVO("������", "����", 2010));
		tSet.add(new PlayerVO("��������", "����", 2005));
		
		System.out.println(tSet);
	}
}
