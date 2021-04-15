package com.learning.threadsleeodemo;

public class ThreadSleepDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("from run method");
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("from child method: "+i);
				//time is provided in milliseconds
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception : "+e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main started");	
		
		System.out.println("Main creating object of class");
		ThreadSleepDemo demo=new ThreadSleepDemo();
		Thread th=new Thread(demo);
		
		System.out.println("Main invoking function");
		th.start();
		//time is provided in miliseconds
		try {
//			//in order to handle the error of 
//			//getting the thread interrupted between sleep time
//			//we should surround it with try catch
//			//Thread keyword refers to current thread
			Thread.sleep(2000);
//			th.interrupt();
			th.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println("Main finished");
	}

	

}
