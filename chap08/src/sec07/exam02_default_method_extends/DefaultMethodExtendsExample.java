package sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {
	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {

			@Override
			public void method1() {
				System.out.println("ci1-method1()");
			}

			@Override
			public void method3() {
				System.out.println("ci1-method3()");
			}

		};
		
		ci1.method1();
		ci1.method2(); // 디폴트 메소드 상속
		ci1.method3();
		System.out.println();
		
		ChildInterface2 ci2 = new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("ci2-method1()");
			}

			@Override
			public void method3() {
				System.out.println("ci2-method3()");
			}

		};
		
		ci2.method1();
		ci2.method2(); // 자식 인터페이스에서 재정의 된 디폴트 메소드
		ci2.method3();
		System.out.println();
		
		ChildInterface3 ci3 = new ChildInterface3() {

			@Override
			public void method1() {
				System.out.println("ci3-method1()");
			}
			
			@Override
			public void method2() {
				System.out.println("ci3-method2()");
			}
			

			@Override
			public void method3() {
				System.out.println("ci3-method3()");
			}

		};
		
		ci3.method1();
		ci3.method2(); // 추상 메소드로 변경된 디폴트 메소드
		ci3.method3();
	}
}
