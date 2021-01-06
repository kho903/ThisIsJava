package sec07.exam02_method;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("김지훈");
		String strVar2 = "김지훈";
		String strVar3 = "김지훈";
		
		// == 
		if(strVar1 == strVar2)
			System.out.println("같은 String 객체를 참조");
		else
			System.out.println("다른 String 객체를 참조"); // O
			
		if(strVar2 == strVar3)
			System.out.println("같은 String 객체를 참조"); // O
		else
			System.out.println("다른 String 객체를 참조");
			
		// equals
		if(strVar1.equals(strVar2))
			System.out.println("같은 String 객체를 참조"); // O
		else
			System.out.println("다른 String 객체를 참조");
	}
}
