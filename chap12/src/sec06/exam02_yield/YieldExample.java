package sec06.exam02_yield;

public class YieldExample {
	// �ٸ� �����忡�� ���� �纸 - yield()
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		// 3�� �Ŀ� threadA�� work�� false�� �ٲ����ν� ����
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = false;
		
		// �� 3�� �Ŀ� threadA�� work�� true�� �ٲ����ν� ThreadA �簳
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = true;
		
		// 3�� �� �� ������ ��� ����
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
	}
}
