package sec02.exam05_float_double;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// �Ǽ��� ����
		double var1 = 3.14;
//		float var2 = 3.14; ����
		float var3 = 3.14F;

		// ���е� �˻�
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;

		// float
		// ��ȣ(1bit) + ����(8bit) + ����(23bit)
		// = 32bit = 4byte

		// double
		// ��ȣ(1bit) + ����(11bit) + ����(52bit)
		// = 64bit = 8byte

		System.out.println(var4);// 0.12345678901234568
		System.out.println(var5);// 0.12345679

		// e ����ϱ�
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;

		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}
}
