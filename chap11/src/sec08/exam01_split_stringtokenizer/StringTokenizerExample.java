package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";

		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		System.out.println(countTokens);
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
