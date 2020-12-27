package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "Kim Jihun");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

//		p1.nation = "USA";
//		p1.ssn = "123123-1231231"; ¿À·ù
		p1.name = "±èÁöÈÆ";

	}

}
