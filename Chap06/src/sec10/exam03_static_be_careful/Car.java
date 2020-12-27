package sec10.exam03_static_be_careful;

public class Car {
	int speed;

	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	public static void main(String[] args) {
//		speed = 60; 오류
//		run(); 오류
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
