package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//������ ���� Comparable ����
class PlayerVO implements Comparable {
	private String name;
	private String position;
	private int reYear;

	public PlayerVO(String name, String position, int regYear) {
		this.name=name;
		this.position=position;
		this.reYear=regYear;
	}
	
	public String toString() {
		return name+":"+position+":"+reYear;
	}

	
	@Override
	public int compareTo(Object o) {
		PlayerVO p = (PlayerVO)o;
		System.out.println("���Ľõ�...");
		return this.name.compareTo(p.name);
	}
	
	public int getReYear() {
		return reYear;
	}
}

public class PlayerVOsortEx {
	public static void main(String[] args) {

		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		list.add(new PlayerVO("ȫ�浿", "����", 1999));
		list.add(new PlayerVO("�Ӳ���", "����", 2005));
		list.add(new PlayerVO("������", "1���", 2003));
		list.add(new PlayerVO("��������", "2���", 2010));

		System.out.println(list);
		System.out.println("����--------");
		Collections.sort(list);
		System.out.println(list);

		//�Դ� �⵵�� ����
		System.out.println("�⵵�� ����");
		Comparator comparator = new YearComparator();
		Collections.sort(list,comparator);
		System.out.println(list);
		
	}
}
