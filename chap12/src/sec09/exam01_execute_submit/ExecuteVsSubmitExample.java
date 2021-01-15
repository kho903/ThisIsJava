package sec09.exam01_execute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수 : " + poolSize + "] 작업 스레드 이름 : " + threadName);
					// 예외 발생
					int value = Integer.parseInt("삼");
				}
			};
//			executorService.execute(runnable);
			// submit이 execute보다 효율적 - 스레드를 재사용
			executorService.submit(runnable);
			// for문이 한번 돌때마다 예외를 출력하기 위해 -- execute일때
			Thread.sleep(10);
		}
		
		// 최대 스레드갯수를 맞추어 가면서 스레드풀이 사용이 된다.
		executorService.shutdown();
	}
}
