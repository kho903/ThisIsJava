package sec02.exam01_nestedclass_object;

public class A {
	A() {
		System.out.println("A °´Ã¼°¡ »ý¼ºµÊ");
		B b = new B();
		b.field1 = 3;
		b.method1();
	}

	class B {
		int field1;

//		static int field2; ½ºÅÂÆ½ ÇÊµå ¼±¾ð ºÒ°¡
		B() {
			System.out.println("B °´Ã¼°¡ »ý¼ºµÊ");
		}

		void method1() {
		}
//		static void method2() {}
	}

	static class C {
		int field1;
		static int field2;

		C() {
			System.out.println("C °´Ã¼°¡ »ý¼ºµÊ");
		}

		void method1() {
		}

		static void method2() {
		}
	}

	void method() {
		// ·ÎÄÃ Å¬·¡½º - ¿ÜºÎ Å¬·¡½º¿¡¼­ Á¢±Ù ºÒ°¡
		class D {
			int field1;

//			static int field2; ¾ÈµÊ
			D() {
				System.out.println("D °´Ã¼°¡ »ý¼ºµÊ");
			}

			void method1() {
			}

//			static void method2() {} ¾ÈµÊ
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
