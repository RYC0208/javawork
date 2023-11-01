package userDefineException02;

public class Bank01 {
//잔액 필드
	private int balance;
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw (int money) throws UserException02 {
		if(balance < money) 
		 throw new	UserException02("잔고 부족:"+(money-balance)+"원 모자람");
		else 
			balance -= money;
	}
	public int getBalance() {
		return balance;
	}
}
