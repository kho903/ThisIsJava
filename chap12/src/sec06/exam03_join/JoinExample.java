package sec06.exam03_join;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		// join()�� �̿��ؼ� thread�� ��� ����Ǳ� ���� ���� ��¹��� �����ϴ� ���� ���´�.
		try {
			sumThread.join();
		} catch (InterruptedException e) {}
		
		System.out.println("1~100 �� : " + sumThread.getSum());
	}
}
