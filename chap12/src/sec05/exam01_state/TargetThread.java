package sec05.exam01_state;

public class TargetThread extends Thread {
	@Override
	public void run() {
		// runnable 혹은 실행 상태
		for (int i = 0; i < 2000000000; i++) {}
		
		// 1.5초 일시정지
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {}
		
		// runnable 혹은 실행 상태
		for (int i = 0; i < 2000000000; i++) {}
		
		// 스레드 종료
	}
}
