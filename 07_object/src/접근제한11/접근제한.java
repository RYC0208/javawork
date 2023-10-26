package 접근제한11;

public class 접근제한 {
	private int balance;			

	void deposit(int money) {
		balance += money;
	}
	void withdraw(int money) {
		
		if(balance < money) {
			System.out.println("잔액이 부족합니다");
	  
		}else {
			balance -= money;
		}}
	int getBlance() {
		return balance;
	}
	void setBalance(int balance) {
		this.balance = balance;
	}
}

//getter(변수의 값을 얻어올 때)
//setter(변수의 값을 넣을 때)