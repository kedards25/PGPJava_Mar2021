package com.learning.threadbasedexecution;

public class ThreadBasedExecution implements Runnable {

	@Override
	public void run() {

		System.out.println("Hello from method");
	}

	public static void main(String[] args) {

		System.out.println("From main function");

		System.out.println("Main creating object of class");
		
		ThreadBasedExecution demo=new ThreadBasedExecution();
		
		System.out.println("Main creating object of Thread");
		Thread thread=new Thread(demo);
	
		System.out.println("Main invoking child function");
		thread.start();

		System.out.println("Main finished execution");

	}

}
