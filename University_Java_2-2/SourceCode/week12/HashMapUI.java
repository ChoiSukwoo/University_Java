package week12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import week12.Person;

class NameComparator implements Comparator<HashMap<String, Integer>> {
	@Override
	public int compare(HashMap<String, Integer> o1, HashMap<String, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.toString().compareTo(o2.toString());
	}
}

//레포트
//입력된 데이터에 대해 이름과 성적순으로 정렬하는 기능의 메뉴를 추가하시오.
//작성한 파일은 pdf 파일로 변환하여 과제방에 올리세요.
public class HashMapUI {
	public static void main(String[] args) throws Exception {
	
		int nMenu = 0;
		boolean bFlag = true;
		String strName = "";
		int nScore = 0;
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		while (bFlag) {
			System.out.println("---------------------------------");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 삭제");
			System.out.println("3. 성적 검색");
			System.out.println("4. 전체성적 출력");
			System.out.println("5. 전체성적 출력(이름순)");
			System.out.println("6. 전체성적 출력(성적순)");
			System.out.println("7. 저장하기");
			System.out.println("8. 불러오기");
			System.out.println("0. 종료");
			System.out.println("---------------------------------");
			System.out.print("0 ~ 4 사이의 숫자를 입력해주세요 : ");
			nMenu = Integer.parseInt(scan.nextLine());
			switch (nMenu) {
			case 0: // 종료
				System.out.println("종료");
				bFlag = false;
				


				
				break;
			case 1:
				System.out.print("이름 : >> ");
				strName = scan.nextLine();
				System.out.print("성적 : >> ");
				nScore = Integer.parseInt(scan.nextLine());
				// HashMap 에 이름과 성적을 입력한다.
				map.put(strName, nScore);
				break;
			case 2: // 성적 삭제
				System.out.print("이름 : >> ");
				strName = scan.nextLine();
				if (map.containsKey(strName) == true) {
					map.remove(strName);
				} else {
					System.out.println("해당 이름이 존재하지않습니다.");
				}
				break;
			case 3: // 성적 검색
				System.out.print("이름 : >>");
				strName = scan.nextLine();
				if (map.containsKey(strName) == true) {
					nScore = map.get(strName);
					System.out.println("이름 : " + strName + ", 점수 : " + nScore);
				} else {
					System.out.println("해당 이름이 존재하지않습니다.");
				}
				break;
			case 4: // 전체성적 조회
				// HashMap 에 있는 모든 키들을 가져와 배열에 저장한다.
				Set<String> keys = map.keySet();
				Iterator it = keys.iterator();
				while (it.hasNext()) {
					String name = (String) it.next();
					Integer score = map.get(name);
					System.out.println("이름 : " + name + ", 성적 : " + score);
				}
				break;

			case 5: // 전체성적 조회 이름순
				// sortByName 함수를 이용하여 해쉬맵의 성적을 정렬한리스트의 이터레이터를 받아 출력한다.
				Iterator it3 = sortByName(map).iterator();
				while (it3.hasNext()) {
					String name = (String) it3.next();
					Integer score = map.get(name);
					System.out.println("이름 : " + name + ", 성적 : " + score);
				}
				break;

			case 6: // 전체성적 조회 성적순
				// sortByGrade 함수를 이용하여 해쉬맵의 성적을 정렬한리스트의 이터레이터를 받아 출력한다.
				Iterator it2 = sortByGrade(map).iterator();
				while (it2.hasNext()) {
					String name = (String) it2.next();
					Integer score = map.get(name);
					System.out.println("이름 : " + name + ", 성적 : " + score);
				}
				break;
			case 7: // 저장하기
				
				OutputStream out = new FileOutputStream("Grade.txt");
				BufferedOutputStream bos= new BufferedOutputStream(out);
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				
				oos.writeObject(map);
				
				oos.close();
				bos.close();
				out.close();
				
				break;
			case 8: // 불러오기
				InputStream in = new FileInputStream("Grade.txt");
				BufferedInputStream bis = new BufferedInputStream(in);
				ObjectInputStream ois = new ObjectInputStream(bis);		
				
				HashMap<String, Integer> list = (HashMap<String, Integer>)ois.readObject();
				map.putAll(list);
				System.out.println(map);
				
				ois.close();
				bis.close();
				in.close();
				break;
			default:
				System.out.println("0 ~ 4 사이의 숫자를 입력해주세요.");
			}
		} // end while
	}

	// 이름순으로 정렬하는 함수
	public static List sortByName(HashMap<String, Integer> map) {
		// 정렬된 값들이 담길 배열
		List<String> list = new ArrayList();
		list.addAll(map.keySet());
		// 정렬하기
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) o1).compareTo(o2);
			}
		});
		// 정렬된값 반환
		return list;
	}

	// 성적순으로 정렬하는함수
	public static List sortByGrade(HashMap<String, Integer> map) {
		// 정렬된 값들이 담길 배열
		List<String> list = new ArrayList();
		list.addAll(map.keySet());
		// 정렬하기
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return map.get(o1) - map.get(o2);
			}
		});
		Collections.reverse(list);
		return list;
	}
}