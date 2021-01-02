package sec07.exam02_default_method_extends;

public interface ChildInterface3 extends ParentInterface {
	@Override // 디폴트 메소드를 추상메소드로 바꿔버림
	public void method2(); 
	
	public void method3();
}
