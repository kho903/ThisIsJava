package sec09.exam01_instance_member;

public class Car {
	String model;
	int speed;

	Car(String model) {
		this.model = model;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 0; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.printf("%s가 달립니다. (시속 : %dkm/h)\n", this.model, this.speed);
		}
	}
}
