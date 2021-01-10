package sec02.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름  : " + thread.getName());

		Thread threadA = new ThreadA();
		System.out.println("ThreadA를 생성한 스레드 : " + thread.currentThread().getName());
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		// start는 한번 호출하고 또 호출할 수 없다.
//		threadA.start();

		Thread threadB = new ThreadB();
		System.out.println("ThreadB를 생성한 스레드 : " + thread.currentThread().getName());
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}
}
