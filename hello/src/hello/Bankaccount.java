package hello;

class Account{
	int balance;
	
	void Account() {
		balance = 0;
	}
	void withdraw(int amount) {
		System.out.println(amount + "�� ���");
		this.balance -= amount;
	}
	void deposit(int amount) {
		System.out.println(amount + "�� ����");
		this.balance += amount;
	}
}


public class Bankaccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		System.out.println("���ο� ���°� ����������ϴ�.");
		a.deposit(50000);
		
		Account b = new Account();
		System.out.println("���ο� ���°� ����������ϴ�.");
		b.deposit(100000);

		System.out.println("�� #1 ���� �ܰ�=" + a.balance);
		System.out.println("�� #2 ���� �ܰ�=" + b.balance);
	}
}
