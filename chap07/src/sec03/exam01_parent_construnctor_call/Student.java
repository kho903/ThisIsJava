package sec03.exam01_parent_construnctor_call;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
//		this.studentNo = studentNo; super�� �׻� ù�ٿ� ���;� �ϹǷ� ����
		super(name, ssn);
		this.studentNo = studentNo;
		System.out.println("�ڽ� ��ü ���� �Ϸ�");
	}

}
