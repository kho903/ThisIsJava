package sec02.exam01_createThread;

import java.awt.Toolkit;
// 멀티 스레드
public class BeepPrintExample3 {
	public static void main(String[] args) {
		// 첫번째 방법
//		Thread thread = new BeepThread();
//		thread.start();
		
		
		// 두번째 방법
		Thread thread = new Thread() {
			@Override
			public void run() {
				// 비프음을 5번 반복해서 소리나게 하는 작업
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {}
				}
			}
		};
		thread.start();
		
		
		// "띵" 문자열을 5번 출력하는 작업
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}
