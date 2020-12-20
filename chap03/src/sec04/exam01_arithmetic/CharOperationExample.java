package sec04.exam01_arithmetic;

public class CharOperationExample {
	public static void main(String[] args) {
		// 리터럴 + 1 해서 char에 넣는 것 가능
		char c1 = 'A' + 1;
		System.out.println("c1 = " + c1);

		char c2 = 'A';
//		char c3 = c2 + 1; 오류

		// 변수를 가지고 연산은 int값으로 산출
		int result = c2 + 1;
		System.out.println("result = " + result);

		char c3 = (char) result;
		System.out.println("c3 = " + c3);
	}
}
