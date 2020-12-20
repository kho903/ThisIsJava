package sec04.exam03_compare;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVal1 = "신용권";
		String strVal2 = "신용권";
		String strVal3 = new String("신용권");

		// == 연산자
		System.out.println(strVal1 == strVal2); // true
		System.out.println(strVal2 == strVal3); // false
		System.out.println();

		// equals 연산자
		System.out.println(strVal1.equals(strVal2)); // true
		System.out.println(strVal2.equals(strVal3)); // true
	}
}
