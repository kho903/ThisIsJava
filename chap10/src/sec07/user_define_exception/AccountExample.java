package sec07.user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		// �����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ� : " + account.getBalance());
		// ����ϱ�
		try {
			account.withdraw(30000);
			System.out.println("���ݾ� : " + account.getBalance());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
			// ��� :
//			sec07.user_define_exception.BalanceInsufficientException: �ܰ���� : 20000 ���ڶ�
//					at sec07.user_define_exception.Account.withdraw(Account.java:19)
//					at sec07.user_define_exception.AccountExample.main(AccountExample.java:11)

			System.out.println();
			System.out.println(e.toString());
			// ��� : sec07.user_define_exception.BalanceInsufficientException: �ܰ���� : 20000 ���ڶ�
		}
	}
}
