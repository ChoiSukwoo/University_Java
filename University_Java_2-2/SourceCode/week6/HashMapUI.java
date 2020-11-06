package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class NameComparator implements Comparator<HashMap<String, Integer>> {

	@Override
	public int compare(HashMap<String, Integer> o1, HashMap<String, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.toString().compareTo(o2.toString());
	}
}

//����Ʈ
//�Էµ� �����Ϳ� ���� �̸��� ���������� �����ϴ� ����� �޴��� �߰��Ͻÿ�.
//�ۼ��� ������ pdf ���Ϸ� ��ȯ�Ͽ� �����濡 �ø�����.
public class HashMapUI {
	public static void main(String[] args) {
		int nMenu = 0;
		boolean bFlag = true;
		String strName = "";
		int nScore = 0;

		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		while (bFlag) {
			System.out.println("---------------------------------");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ��ü���� ���");
			System.out.println("5. ��ü���� ���(�̸���)");
			System.out.println("6. ��ü���� ���(������)");
			System.out.println("0. ����");
			System.out.println("---------------------------------");

			System.out.print("0 ~ 4������ ���ڸ� �Է����ּ��� : ");
			nMenu = Integer.parseInt(scan.nextLine());

			switch (nMenu) {
			case 0: // ����
				System.out.println("����");
				bFlag = false;
				break;
			case 1:
				System.out.print("�̸� : >> ");
				strName = scan.nextLine();
				System.out.print("���� : >> ");
				nScore = Integer.parseInt(scan.nextLine());
				// HashMap�� �̸��� ������ �Է��Ѵ�.
				map.put(strName, nScore);
				break;

			case 2: // ���� ����
				System.out.print("�̸� : >> ");
				strName = scan.nextLine();
				if (map.containsKey(strName) == true) {
					map.remove(strName);
				} else {
					System.out.println("�ش� �̸��� ���������ʽ��ϴ�.");
				}
				break;

			case 3: // ���� �˻�
				System.out.print("�̸� : >>");
				strName = scan.nextLine();
				if (map.containsKey(strName) == true) {
					nScore = map.get(strName);
					System.out.println("�̸� : " + strName + ", ���� : " + nScore);
				}else {
					System.out.println("�ش� �̸��� ���������ʽ��ϴ�.");
				}
				break;

			case 4: // ��ü���� ��ȸ
				// HashMap�� �ִ� ��� Ű���� ������ �迭�� �����Ѵ�.
				Set<String> keys = map.keySet();
				Iterator it = keys.iterator();

				while (it.hasNext()) {
					String name = (String) it.next();
					Integer score = map.get(name);
					System.out.println("�̸� : " + name + ", ���� : " + score);
				}
				break;
				
			case 5: // ��ü���� ��ȸ �̸���
				// HashMap�� �ִ� ��� Ű���� ������ �迭�� �����Ѵ�.
				Iterator it3 = sortByName(map).iterator();

				while (it3.hasNext()) {
					String name = (String) it3.next();
					Integer score = map.get(name);
					System.out.println("�̸� : " + name + ", ���� : " + score);
				}
				break;
				
			case 6: // ��ü���� ��ȸ ������
				// HashMap�� �ִ� ��� Ű���� ������ �迭�� �����Ѵ�.
				Iterator it2 = sortByGrade(map).iterator();

				while (it2.hasNext()) {
					String name = (String) it2.next();
					Integer score = map.get(name);
					System.out.println("�̸� : " + name + ", ���� : " + score);
				}
				break;

			default:
				System.out.println("0 ~ 4������ ���ڸ� �Է����ּ���.");
			}
		} // end while
	}

	// �̸������� �����ϴ� �Լ�
	public static List sortByName(HashMap<String, Integer> map) {
		// ���ĵ� ������ ��� �迭
		List<String> list = new ArrayList();
		list.addAll(map.keySet());

		// �����ϱ�
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) o1).compareTo(o2);
			}
		});

		// ���ĵȰ� ��ȯ
		return list;
	}

	// ���������� �����ϴ��Լ�
	public static List sortByGrade(HashMap<String, Integer> map) {
		// ���ĵ� ������ ��� �迭
		List<String> list = new ArrayList();
		list.addAll(map.keySet());

		// ���� �Լ� ����
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return map.get(o1) - map.get(o2);
			}
		});
		Collections.reverse(list);
		return list;
	}

}
