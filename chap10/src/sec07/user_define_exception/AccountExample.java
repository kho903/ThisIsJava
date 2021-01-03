package sec07.user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		// 출금하기
		try {
			account.withdraw(30000);
			System.out.println("예금액 : " + account.getBalance());
		} catch (BalanceInsufficientException e) {
			System.out.println("예외 발생");
		}
	}
}
