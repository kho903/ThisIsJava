package sec06.exam01_sleep;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {
				// �־��� �ð����� �Ͻ����� - sleep()
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}