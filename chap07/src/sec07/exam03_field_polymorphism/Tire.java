package sec07.exam03_field_polymorphism;

public class Tire {
	public int maxRotation; // �ִ� ȸ�� ��
	public int accumulatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾��� ��ġ

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.printf("%s Tire ���� : %d\n", location, (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.printf("*** %s Tire ��ũ ***\n", location);
			return false;
		}
	}
}
