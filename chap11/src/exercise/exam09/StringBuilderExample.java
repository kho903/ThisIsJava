package exercise.exam09;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i <= 100; i++)
			str += i;
		System.out.println(str);

		// ���� �ڵ�
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++)
			sb.append(i);
		System.out.println(sb);
	}
}
