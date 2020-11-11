package week11;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionEx {
	public static void main(String[] args) {
		LinkedList<String> mList = new LinkedList<String>();
		
		mList.add("트랜스포머");
		mList.add("스타워즈");
		mList.add("메트릭스");
		mList.add(0,"터미네이터");
		mList.add(2,"아바타");
		
		System.out.println(mList);
		
		Iterator it = mList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		System.out.println();
		System.out.println("------- 오른차순 정렬 --------");
		Collections.sort(mList);
		System.out.println(mList);
		System.out.println("------- 내임차순 정렬 --------");
		Collections.reverse(mList);
		System.out.println(mList);
		int index = Collections.binarySearch(mList, "아바타");
		System.out.println("아바타는" + (index+1)+"번째입니다.");
	}
}
