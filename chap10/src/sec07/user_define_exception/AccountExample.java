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
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
			// 결과 :
//			sec07.user_define_exception.BalanceInsufficientException: 잔고부족 : 20000 모자람
//					at sec07.user_define_exception.Account.withdraw(Account.java:19)
//					at sec07.user_define_exception.AccountExample.main(AccountExample.java:11)

			System.out.println();
			System.out.println(e.toString());
			// 결과 : sec07.user_define_exception.BalanceInsufficientException: 잔고부족 : 20000 모자람
		}
	}
}
