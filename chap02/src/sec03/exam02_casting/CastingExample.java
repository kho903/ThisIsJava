package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		// ���� Ÿ�� ��ȯ
		// ū Ÿ���� ���� Ÿ�� ������ �ɰ��� �� �Ѻκи� ���� Ÿ������ ������ ��ȯ
		int intValue = 44032;
//		char charValue = intValue; ����
		char charValue = (char) intValue;
		System.out.println(charValue);

		long longValue = 500;
//		intValue = longValue; ����
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
//		intValue = doubleValue; ����
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
