package sec08_exam03_method_call;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.keyTurnOn();
		myCar.run();

		int speed = myCar.getSpeed();
		System.out.printf("����  : %dkm/h\n", speed);
	}

}
