package com.multithreading.extendingthread;

public class ChildThread extends Thread {

	public ChildThread(String name, int priority) {
		super(name);
		this.setPriority(priority);
		System.out.println(this);
		start();
	}

@Override
	public void run() {
String name=Thread.currentThread().getName();
Loan loan =new Loan();
System.out.println("");
