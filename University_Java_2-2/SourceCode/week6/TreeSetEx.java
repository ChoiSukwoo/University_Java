package week6;

import java.util.Iterator;
import java.util.TreeSet;

//String ũ������ �̹� ���ı���� ������ Comparable �������̽��� �����Ǿ� �ִ�.
//������ ���� ���� Ŭ������ ������ ��ü�� ���� ����� �������� Comparable �������̽��� �����ؾ��Ѵ�.
public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();

		tree.add("BBB");
		tree.add("KKK");
		tree.add("AAA");
		tree.add("ZZZ");
		tree.add("ppp");

		System.out.println(tree);

		Iterator it = tree.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
