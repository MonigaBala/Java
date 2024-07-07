package com.multithreading.implrunnable;

import com.multithreading.extendingthread.Loan;

public class Runner implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		Loan loan = new Loan();
		loan.calculateInterest(name, 9000);
		System.out.println("Run completed");

	}

}
