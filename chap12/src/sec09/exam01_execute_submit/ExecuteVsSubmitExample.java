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
					System.out.println("[�� ������ ���� : " + poolSize + "] �۾� ������ �̸� : " + threadName);
					// ���� �߻�
					int value = Integer.parseInt("��");
				}
			};
//			executorService.execute(runnable);
			// submit�� execute���� ȿ���� - �����带 ����
			executorService.submit(runnable);
			// for���� �ѹ� �������� ���ܸ� ����ϱ� ���� -- execute�϶�
			Thread.sleep(10);
		}
		
		// �ִ� �����尹���� ���߾� ���鼭 ������Ǯ�� ����� �ȴ�.
		executorService.shutdown();
	}
}
