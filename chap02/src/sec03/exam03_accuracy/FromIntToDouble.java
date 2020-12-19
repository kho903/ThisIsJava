package sec03.exam03_accuracy;

public class FromIntToDouble {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;

		double num3 = num2;
		num2 = (int) num3;

		int result = num1 - num2;
		System.out.println(result);
		// 연산식에서 자동 타입 변환
		// - 연산은 같은 타입의 피연산자(operand)간에만 수행
		// -> 서로 다른 타입의 피연산자는 같은 타입으로 변환됨
		// -> 두 피연산자 중 크기가 큰 타입으로 자동 변환
	}
}
