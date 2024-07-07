package com.multithreading.extendingthread;

public class Loan {

	public double calculateInterest(String name, double amount) {
		System.out.println("Interest calculation for : " + name);
		double interest = (amount * 5 * 12) / 100;
		System.out.println("Interest : " + interest);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return interest;

	}
}
