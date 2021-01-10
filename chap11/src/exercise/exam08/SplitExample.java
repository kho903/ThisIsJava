package exercise.exam08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";

		// ��� 1 (split() �޼ҵ� �̿�)
		String[] strSplit = str.split(",");
		for (String strToken : strSplit)
			System.out.println(strToken);
		System.out.println();

		// ��� 2 (StringTokenizer �̿�)
		StringTokenizer strToken = new StringTokenizer(str, ",");
		while (strToken.hasMoreTokens()) {
			System.out.println(strToken.nextToken());
		}
	}
}
