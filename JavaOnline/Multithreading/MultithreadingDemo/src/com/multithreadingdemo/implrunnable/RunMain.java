package com.multithreadingdemo.implrunnable;

class Runner implements Runnable {
	@Override
	public void run() {
		System.out.println("In run");
	}
}

public class RunMain {

	public static void main(String[] args) {

		Runnable runner = new Runner();
		Thread thread1 = new Thread(runner, "Thread 1");
		thread1.start();

	}

}
