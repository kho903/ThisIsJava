package exercise.exam11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		// -128 ~ 127 ���̹����� ��ü�� ������
		// ������ ����� �ٸ� ��ü
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);

		// ������ ���Ϸ���
		System.out.println(obj3.intValue() == obj4.intValue());
	}
}
