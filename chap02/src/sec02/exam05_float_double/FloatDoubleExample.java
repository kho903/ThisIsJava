package sec02.exam05_float_double;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 실수값 저장
		double var1 = 3.14;
//		float var2 = 3.14; 오류
		float var3 = 3.14F;

		// 정밀도 검사
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;

		// float
		// 부호(1bit) + 지수(8bit) + 가수(23bit)
		// = 32bit = 4byte

		// double
		// 부호(1bit) + 지수(11bit) + 가수(52bit)
		// = 64bit = 8byte

		System.out.println(var4);// 0.12345678901234568
		System.out.println(var5);// 0.12345679

		// e 사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;

		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}
}
