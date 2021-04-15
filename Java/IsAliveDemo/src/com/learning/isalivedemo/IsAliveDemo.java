package com.learning.isalivedemo;

public class IsAliveDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("from run method");
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("from child method: "+i);
				System.out.println("is child thread alive??"
						+ ""+Thread.currentThread().isAlive());
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("child thread finished");
	}
	
	public static void main(String[] args) {
		
System.out.println("Main started");	
		
		System.out.println("Main creating object of class");
		IsAliveDemo demo=new IsAliveDemo();
		Thread th=new Thread(demo);
		
		System.out.println("Main invoking function");
		th.start();
		//time is provided in miliseconds
		try {
			//in order to handle the error of 
			//getting the thread interrupted between sleep time
			//we should surround it with try catch
			//Thread keyword refers to current thread
			System.out.println("is child thread alive in "
					+ "main before main sleeps??"+th.isAlive());
			Thread.sleep(3000);
			System.out.println("is child thread alive in "
					+ "main after main awakes??"+th.isAlive());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("is child thread alive in main??"+th.isAlive());
		System.out.println("Main finished");
		
	}

}
