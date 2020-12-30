package sec05.exam02_final_method;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}

//	public final void stop() {} : final 메소드 재정의 불가
	
}
