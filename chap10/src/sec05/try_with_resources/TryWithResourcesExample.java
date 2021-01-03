package sec05.try_with_resources;

public class TryWithResourcesExample {
	public static void main(String[] args) {
		// �ڵ������� close() �����
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}
}
