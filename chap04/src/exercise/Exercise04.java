package exercise;

public class Exercise04 {
	public static void main(String[] args) {
		int a;
		int b;
		while (true) {
			a = (int) (Math.random() * 6) + 1;
			b = (int) (Math.random() * 6) + 1;
			System.out.printf("(%d, %d)\n", a, b);
			if (a + b == 5)
				break;
		}
	}
}
