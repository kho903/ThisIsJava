package exercise.exam11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		// -128 ~ 127 사이범위의 객체는 공유됨
		// 범위를 벗어나면 다른 객체
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);

		// 값끼리 비교하려면
		System.out.println(obj3.intValue() == obj4.intValue());
	}
}
