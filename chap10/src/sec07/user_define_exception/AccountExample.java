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
			System.out.println("���� �߻�");
		}
	}
}
