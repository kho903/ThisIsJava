package sec03.exam03_localclass_access;

public class Outter {
	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner {
			// final을 붙하면 method 안에 다음과 같이 복사됨 
//			int arg = 10;
//			int localVariable = 1;
			void method() {
				int result = arg + localVariable;
			}
		}
	}

	// 자바 8 이후
	public void method2(int arg) {
		// final을 붙히지 않아도 final의 특성을 갖는다.
		// 단, local class에서 사용이 되지 않으면
		// localVariable은 final 특성 X -> 변경 가능
		int localVariable = 1;
		class Inner{
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
