package sec03.exam01_parent_construnctor_call;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "123456-1234567", 1);
		// �θ� ��ü ���� �� �ڽ� ��ü ������
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}

}
