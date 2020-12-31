package sec07.exam03_field_polymorphism;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.printf("%s KumhoTire ¼ö¸í : %d\n", location, (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.printf("*** %s KumhoTire ÆãÅ© ***\n", location);
			return false;
		}
	}
}
