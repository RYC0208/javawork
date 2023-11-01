package userDefineException02;

public class BankTest {

	public static void main(String[] args) {
		Bank01 bank = new Bank01();
		
		bank.deposit(1_000);
		System.out.println("현재 잔액: " + bank.getBalance());
		try {
			
			bank.withdraw(1000);
			System.out.println("출금 되었습니다.");
			System.out.println("현재 잔액: " + bank.getBalance());
		} catch (UserException02 e) {
			System.out.println(e.getMessage());
		}
	}

}
