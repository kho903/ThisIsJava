package sec03.exam03_localclass_access;

public class Outter {
	// �ڹ� 7 ����
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner {
			// final�� ���ϸ� method �ȿ� ������ ���� ����� 
//			int arg = 10;
//			int localVariable = 1;
			void method() {
				int result = arg + localVariable;
			}
		}
	}

	// �ڹ� 8 ����
	public void method2(int arg) {
		// final�� ������ �ʾƵ� final�� Ư���� ���´�.
		// ��, local class���� ����� ���� ������
		// localVariable�� final Ư�� X -> ���� ����
		int localVariable = 1;
		class Inner{
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
