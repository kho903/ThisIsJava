package sec03.exam01_parent_construnctor_call;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
//		this.studentNo = studentNo; super는 항상 첫줄에 나와야 하므로 오류
		super(name, ssn);
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}

}
