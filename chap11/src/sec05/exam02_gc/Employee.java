package sec05.exam02_gc;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.printf("Employee(%d)�� �޸𸮿��� ������\n", eno);
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.printf("Employee(%d)�� �޸𸮿��� ���ŵ�\n", eno);
	}
}
