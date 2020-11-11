package week11;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionEx {
	public static void main(String[] args) {
		LinkedList<String> mList = new LinkedList<String>();
		
		mList.add("Ʈ��������");
		mList.add("��Ÿ����");
		mList.add("��Ʈ����");
		mList.add(0,"�͹̳�����");
		mList.add(2,"�ƹ�Ÿ");
		
		System.out.println(mList);
		
		Iterator it = mList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		System.out.println();
		System.out.println("------- �������� ���� --------");
		Collections.sort(mList);
		System.out.println(mList);
		System.out.println("------- �������� ���� --------");
		Collections.reverse(mList);
		System.out.println(mList);
		int index = Collections.binarySearch(mList, "�ƹ�Ÿ");
		System.out.println("�ƹ�Ÿ��" + (index+1)+"��°�Դϴ�.");
	}
}
