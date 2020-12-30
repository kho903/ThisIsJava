package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();

		Parent parent = child; // 자동 타입 변환

		parent.method1(); // Parent-method1()
		parent.method2(); // Child-method2()
//		parent.method3(); // 호출 불가

	}

}
