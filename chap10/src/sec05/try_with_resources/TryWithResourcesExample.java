package sec05.try_with_resources;

public class TryWithResourcesExample {
	public static void main(String[] args) {
		// 자동적으로 close() 실행됨
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}
