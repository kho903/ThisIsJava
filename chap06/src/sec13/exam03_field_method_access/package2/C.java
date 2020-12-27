package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; default는 같은 패키지 내에서만
//		a.field3 = 1; private는 같은 클래스 내에서만

		a.method1();
//		a.method2(); default는 같은 패키지 내에서만
//		a.method3(); private는 같은 클래스 내에서만
	}
}
