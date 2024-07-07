package com.multithreading.implrunnable;

public class RunMain {

	public static void main(String[] args) {
		
		Runner runner=new Runner();
		Thread threadOne = new Thread(runner,"Thread 1");
		threadOne.start();
	}

}
