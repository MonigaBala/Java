package bankDemo;

public class Bank {
	private double balance;

	public Bank(double balance) {
		this.balance = balance;
	}

	public void withdraw(int x) {
		if (x < 0 || x > balance) {
			System.out.println("Amount cannot be withdrawn");
		} else {
			balance -= x;
		}
	}

	public void deposit(int x) {
		if (x < 0) {
			System.out.println("Amount cannot be deposited");
		} else {
			balance += x;
		}
	}

	public double getBalance() {
		return balance;
	}

}
