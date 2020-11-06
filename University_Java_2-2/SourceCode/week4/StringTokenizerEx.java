package week4;

import java.util.StringTokenizer;


public class StringTokenizerEx {
	public static void main(String[] args) {
			StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã","/");
			
			while (st.hasMoreElements()) {
				System.out.println(st.nextToken());
			}
	}
}
