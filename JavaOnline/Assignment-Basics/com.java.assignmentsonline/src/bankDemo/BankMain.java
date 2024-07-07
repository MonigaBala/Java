package bankDemo;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the initial amount: ");
		double balance = scanner.nextDouble();

		Bank bank = new Bank(balance);

		System.out.println("Enter the amount to be deposited: ");
		int deposit = scanner.nextInt();
		bank.deposit(deposit);

		System.out.println("Enter the amount to be withdraw: ");
		int withdraw = scanner.nextInt();
		bank.withdraw(withdraw);

		System.out.println("The balance is: "+bank.getBalance());
		scanner.close();
	}

}
