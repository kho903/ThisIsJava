package exercise.exam14;

public class Member {
	String name;
	String id;
	String password;
	int age;

	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		Member member = new Member("ȫ�浿", "java");
		System.out.println(member.name);
	}
}
