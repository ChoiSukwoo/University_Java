package week11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		
		list.add(new PlayerVO("ȫ�浿", "1���", 1993));
		list.add(new PlayerVO("�Ӳ���", "2���", 2001));
		list.add(new PlayerVO("������", "����", 2010));
		list.add(new PlayerVO("��������", "����", 2005));
		
		System.out.println(list);
		System.out.println("---����--");
		Collections.sort(list);
		System.out.println(list);
	}
}
