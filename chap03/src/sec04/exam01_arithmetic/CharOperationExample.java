package sec04.exam01_arithmetic;

public class CharOperationExample {
	public static void main(String[] args) {
		// ���ͷ� + 1 �ؼ� char�� �ִ� �� ����
		char c1 = 'A' + 1;
		System.out.println("c1 = " + c1);

		char c2 = 'A';
//		char c3 = c2 + 1; ����

		// ������ ������ ������ int������ ����
		int result = c2 + 1;
		System.out.println("result = " + result);

		char c3 = (char) result;
		System.out.println("c3 = " + c3);
	}
}
