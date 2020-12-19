package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		// 강제 타입 변환
		// 큰 타입을 작은 타입 단위로 쪼개고 끝 한부분만 작은 타입으로 강제적 변환
		int intValue = 44032;
//		char charValue = intValue; 오류
		char charValue = (char) intValue;
		System.out.println(charValue);

		long longValue = 500;
//		intValue = longValue; 오류
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
//		intValue = doubleValue; 오류
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
