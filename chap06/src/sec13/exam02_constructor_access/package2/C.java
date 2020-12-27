package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.*;

public class C {
	A a1 = new A(true);
//	A a2 = new A(); default는 다른 패키지에서 x
//	A a3 = new A("문자열"); 오류 : private은 외부에서 x
}
