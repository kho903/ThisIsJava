package exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		int inputValue;
		int plus_balance;
		int minus_balance;
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("--------------------------------");
			System.out.print("���� > ");

			inputValue = scanner.nextInt();
			switch(inputValue){
			case 1:
				System.out.print("������ �ݾ��� �Է��ϼ��� : ");
				plus_balance = scanner.nextInt();
				balance += plus_balance;
				System.out.printf("�ܰ� : %d��\n", balance);
				break;
			case 2:
				System.out.print("����� �ݾ��� �Է��ϼ��� : ");
				minus_balance = scanner.nextInt();
				if (balance >=minus_balance)
					balance -= minus_balance;
				else
					System.out.println("�ܾ��� �����մϴ�.");

				System.out.printf("�ܰ� : %d��\n", balance);
				break;
			case 3:
				System.out.printf("�ܰ� : %d��\n", balance);
				break;
			case 4:
				run = false;
				break;
			}
			
			
			
		}
		System.out.println("���α׷� ����");

	}

}
