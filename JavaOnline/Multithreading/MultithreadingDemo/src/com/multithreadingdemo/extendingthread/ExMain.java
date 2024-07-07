package com.multithreadingdemo.extendingthread;

public class ExMain {
	
public static void main(String[] args) {
	

		Child child1 = new Child("Thread1", 8);
		Child child2 = new Child("Thread2", 5);

		for (int i = 0; i < 10; i++) {
			System.out.println("Main " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			child1.join();
			child2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main completed");
	

		for (int i = 0; i < 10; i++) {
			System.out.println(name + "" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Run completed");
	}
}

	}


