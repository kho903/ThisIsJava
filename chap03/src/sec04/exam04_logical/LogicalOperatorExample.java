package sec04.exam04_logical;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';

		// 대문자 : 65 ~ 90
		if ((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자 이군요.");
		}

		// 소문자 : 97 ~ 122
		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자 이군요.");
		}

		// 0 ~ 9
		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 숫자 이군요.");
		}

		int value = 6;
		
		// | , || 차이점:
		// | 일 경우 앞에 것이 true여도 뒤 연산 실행
		// || 일 경우 앞에 것이 true이면 뒤 연산 실행 X
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수 이군요.");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수 이군요.");
		}
	}

}
