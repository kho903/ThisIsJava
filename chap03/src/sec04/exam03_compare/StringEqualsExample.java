package sec04.exam03_compare;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVal1 = "�ſ��";
		String strVal2 = "�ſ��";
		String strVal3 = new String("�ſ��");

		// == ������
		System.out.println(strVal1 == strVal2); // true
		System.out.println(strVal2 == strVal3); // false
		System.out.println();

		// equals ������
		System.out.println(strVal1.equals(strVal2)); // true
		System.out.println(strVal2.equals(strVal3)); // true
	}
}
