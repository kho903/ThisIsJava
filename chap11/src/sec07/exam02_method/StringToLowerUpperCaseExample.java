package sec07.exam02_method;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";

		System.out.println(str1.equals(str2)); // false

		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); // true

		// ��ҹ��� ������� ���ϴ� �޼ҵ�
		System.out.println(str1.equalsIgnoreCase(str2)); // true
	}
}
