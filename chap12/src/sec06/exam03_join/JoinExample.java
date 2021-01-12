package sec06.exam03_join;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		// join()을 이용해서 thread가 모두 실행되기 전에 다음 출력문을 실행하는 것을 막는다.
		try {
			sumThread.join();
		} catch (InterruptedException e) {}
		
		System.out.println("1~100 합 : " + sumThread.getSum());
	}
}
