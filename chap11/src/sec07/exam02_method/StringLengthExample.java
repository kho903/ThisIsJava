package sec07.exam02_method;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "7306241230123";
		System.out.println(ssn.length());
		int length = ssn.length();
		if (length == 13)
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
		else
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�.");
	}
}
