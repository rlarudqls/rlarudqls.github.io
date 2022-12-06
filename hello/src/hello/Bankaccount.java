package hello;

class Account{
	int balance;
	
	void Account() {
		balance = 0;
	}
	void withdraw(int amount) {
		System.out.println(amount + "원 출금");
		this.balance -= amount;
	}
	void deposit(int amount) {
		System.out.println(amount + "원 저축");
		this.balance += amount;
	}
}


public class Bankaccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		System.out.println("새로운 계좌가 만들어졌습니다.");
		a.deposit(50000);
		
		Account b = new Account();
		System.out.println("새로운 계좌가 만들어졌습니다.");
		b.deposit(100000);

		System.out.println("고객 #1 계좌 잔고=" + a.balance);
		System.out.println("고객 #2 계좌 잔고=" + b.balance);
	}
}
