package sec13.exam01_class_access.package2;

import sec13.exam01_class_access.package1.*;

public class C {
//	A a; - default 제한자는 다른 패키지에서 사용 불가
	B b; // public은 다른 패키지에서도 사용 가능
}
