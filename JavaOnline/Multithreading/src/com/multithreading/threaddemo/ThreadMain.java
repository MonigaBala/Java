package com.multithreading.threaddemo;

/**
 * ThreadMain class which has thread object to print the currentThread and
 * various method in Thread class are invoked and used to set name,priority and
 * static sleep() method is used .
 * 
 * @author Moniga
 */
public class ThreadMain {

	public static void main(String[] args) {

		Thread thread = Thread.currentThread();
		System.out.println(thread);

		thread.setName("Thread1");
		thread.setPriority(Thread.MIN_PRIORITY + 3);
		System.out.println(thread);

		for (int i = 0; i < 10; i++) {
			System.out.println("Main " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.println("Completed");
	}

}
