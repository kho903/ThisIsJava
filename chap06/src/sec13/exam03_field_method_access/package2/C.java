package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; default�� ���� ��Ű�� ��������
//		a.field3 = 1; private�� ���� Ŭ���� ��������

		a.method1();
//		a.method2(); default�� ���� ��Ű�� ��������
//		a.method3(); private�� ���� Ŭ���� ��������
	}
}
