package sec06.exam02_yield;

public class YieldExample {
	// 다른 스레드에게 실행 양보 - yield()
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		// 3초 후에 threadA의 work를 false로 바꿈으로써 정지
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = false;
		
		// 또 3초 후에 threadA의 work를 true로 바꿈으로써 ThreadA 재개
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.work = true;
		
		// 3초 후 두 스레드 모두 종료
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
	}
}
