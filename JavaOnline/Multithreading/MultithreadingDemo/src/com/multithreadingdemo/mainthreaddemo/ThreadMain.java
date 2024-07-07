package com.multithreadingdemo.mainthreaddemo;

public class ThreadMain {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Thread 1");
		t.setPriority(Thread.MIN_PRIORITY + 3);
		System.out.println(t);

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
