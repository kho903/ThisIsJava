package sec05.exam01_state;

public class TargetThread extends Thread {
	@Override
	public void run() {
		// runnable Ȥ�� ���� ����
		for (int i = 0; i < 2000000000; i++) {}
		
		// 1.5�� �Ͻ�����
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {}
		
		// runnable Ȥ�� ���� ����
		for (int i = 0; i < 2000000000; i++) {}
		
		// ������ ����
	}
}
