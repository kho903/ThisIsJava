package sec07.exam02_field_initialize;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("±Ëxx", "991111-1111111");
		System.out.printf("%s, %s, %s\n", k1.nation, k1.name, k1.ssn);
		
		Korean k2 = new Korean("¿Ãyy", "001111-0000000");
		System.out.printf("%s, %s, %s", k2.nation, k2.name, k2.ssn);

	}

}
