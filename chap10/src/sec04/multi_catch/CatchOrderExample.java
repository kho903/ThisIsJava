package sec04.multi_catch;

public class CatchOrderExample {
	public static void main(String[] args) {

		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java CatchByExceptionKinExample num1 num2");

		} catch (Exception e) {
			System.out.println("ArrayIndexOutOfBoundsException�� ������ ��� Exception");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}
