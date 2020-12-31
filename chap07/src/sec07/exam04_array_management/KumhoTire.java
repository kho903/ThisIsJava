package sec07.exam04_array_management;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.printf("%s KumhoTire ���� : %d\n", location, (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.printf("*** %s KumhoTire ��ũ ***\n", location);
			return false;
		}
	}
}
