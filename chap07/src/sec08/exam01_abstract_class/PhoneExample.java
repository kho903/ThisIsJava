package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone; - 추상클래스는 new 연산자로 생성 못함
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
