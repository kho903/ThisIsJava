package sec05.exam02_gc;

public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.print("emp가 최종적으로 참조하는 사원번호 : ");
		System.out.println(emp.eno);
		System.gc(); // 보통 프로그램 중간에 넣는 것이 성능향상에 좋다.
	}
}
