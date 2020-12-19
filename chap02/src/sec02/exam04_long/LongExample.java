package sec02.exam04_long;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		// L을 붙임으로써 8바이트 수라고 선언
		// 4바이트 범위를 넘어선 상태에서 L을 붙이지 않으면 오류
		// long var3 = 10000000000;
		long var4= 10000000000L;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
