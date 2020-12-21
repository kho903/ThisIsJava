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
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택 > ");

			inputValue = scanner.nextInt();
			switch(inputValue){
			case 1:
				System.out.print("예금할 금액을 입력하세요 : ");
				plus_balance = scanner.nextInt();
				balance += plus_balance;
				System.out.printf("잔고 : %d원\n", balance);
				break;
			case 2:
				System.out.print("출금할 금액을 입력하세요 : ");
				minus_balance = scanner.nextInt();
				if (balance >=minus_balance)
					balance -= minus_balance;
				else
					System.out.println("잔액이 부족합니다.");

				System.out.printf("잔고 : %d원\n", balance);
				break;
			case 3:
				System.out.printf("잔고 : %d원\n", balance);
				break;
			case 4:
				run = false;
				break;
			}
			
			
			
		}
		System.out.println("프로그램 종료");

	}

}
