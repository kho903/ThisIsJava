package sec02.exam01_nestedclass_object;

public class A {
	A() {
		System.out.println("A ��ü�� ������");
		B b = new B();
		b.field1 = 3;
		b.method1();
	}

	class B {
		int field1;

//		static int field2; ����ƽ �ʵ� ���� �Ұ�
		B() {
			System.out.println("B ��ü�� ������");
		}

		void method1() {
		}
//		static void method2() {}
	}

	static class C {
		int field1;
		static int field2;

		C() {
			System.out.println("C ��ü�� ������");
		}

		void method1() {
		}

		static void method2() {
		}
	}

	void method() {
		// ���� Ŭ���� - �ܺ� Ŭ�������� ���� �Ұ�
		class D {
			int field1;

//			static int field2; �ȵ�
			D() {
				System.out.println("D ��ü�� ������");
			}

			void method1() {
			}

//			static void method2() {} �ȵ�
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
