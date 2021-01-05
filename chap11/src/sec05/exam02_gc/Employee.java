package sec05.exam02_gc;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.printf("Employee(%d)이 메모리에서 생성됨\n", eno);
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.printf("Employee(%d)이 메모리에서 제거됨\n", eno);
	}
}
