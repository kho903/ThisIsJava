package sec02.runtime_exception;

//매개값을 하나만 입력 시
// ArrayIndexOutOfBoundsException 발생

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];			
			
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		}else {
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println(" 값1 값2");
		}

	}
}
