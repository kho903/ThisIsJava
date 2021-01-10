package sec02.exam01_createThread;

import java.awt.Toolkit;
// ��Ƽ ������
public class BeepPrintExample2 {
	public static void main(String[] args) {
		// ù��° ���
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
		
		// �ι�° ���
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (Exception e) {}
//				}
//			}
//		});
		
		// ����° ���
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (Exception e) {}
			}
		});
		
		thread.start();
		
		// "��" ���ڿ��� 5�� ����ϴ� �۾�
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}
