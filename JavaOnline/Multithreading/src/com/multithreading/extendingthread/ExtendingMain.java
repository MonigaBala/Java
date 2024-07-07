package com.multithreading.extendingthread;

public class ExtendingMain {

	public static void main(String[] args) {
		
		ChildThread childOne = new ChildThread("ThreadOne", 8);
		ChildThread childTwo = new ChildThread("ThreadTwo", 5);

		Loan loan = new Loan();
		loan.calculateInterest("Ram", 4000);

		try {
			childOne.join();
			childTwo.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main completed");
	}

}
