package sec07.exam02_method;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("������");
		String strVar2 = "������";
		String strVar3 = "������";
		
		// == 
		if(strVar1 == strVar2)
			System.out.println("���� String ��ü�� ����");
		else
			System.out.println("�ٸ� String ��ü�� ����"); // O
			
		if(strVar2 == strVar3)
			System.out.println("���� String ��ü�� ����"); // O
		else
			System.out.println("�ٸ� String ��ü�� ����");
			
		// equals
		if(strVar1.equals(strVar2))
			System.out.println("���� String ��ü�� ����"); // O
		else
			System.out.println("�ٸ� String ��ü�� ����");
	}
}
