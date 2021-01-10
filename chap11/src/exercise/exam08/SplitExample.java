package exercise.exam08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";

		// 방법 1 (split() 메소드 이용)
		String[] strSplit = str.split(",");
		for (String strToken : strSplit)
			System.out.println(strToken);
		System.out.println();

		// 방법 2 (StringTokenizer 이용)
		StringTokenizer strToken = new StringTokenizer(str, ",");
		while (strToken.hasMoreTokens()) {
			System.out.println(strToken.nextToken());
		}
	}
}
