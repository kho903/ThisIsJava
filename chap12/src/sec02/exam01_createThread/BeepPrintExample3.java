package sec02.exam01_createThread;

import java.awt.Toolkit;
// ��Ƽ ������
public class BeepPrintExample3 {
	public static void main(String[] args) {
		// ù��° ���
//		Thread thread = new BeepThread();
//		thread.start();
		
		
		// �ι�° ���
		Thread thread = new Thread() {
			@Override
			public void run() {
				// �������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
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
		
		
		// "��" ���ڿ��� 5�� ����ϴ� �۾�
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}
