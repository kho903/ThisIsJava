package sec02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		
		for(int i=0;i<5;i++) {
			var1++;
			var2++;
			System.out.printf("var1 : %d\t var2 : %d\n", var1, var2);
		}
	}

}
