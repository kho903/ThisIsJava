package sec07.exam03_field_polymorphism;

public class Tire {
	public int maxRotation; // 최대 회전 수
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.printf("%s Tire 수명 : %d\n", location, (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.printf("*** %s Tire 펑크 ***\n", location);
			return false;
		}
	}
}
