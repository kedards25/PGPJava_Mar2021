package com.learning.threadlifecycledemo;

public class ThreadLifeCycleDemo implements Runnable {

	public void run()
	{
		for (int i = 0; i < 10; i++) {
			//not runnable by using sleep
			try {
				Thread.sleep(500);
				System.out.println(i);
				
				//checking if current thread is interrupted by another thread or not
				//System.out.println("Is interrupted: "+Thread.interrupted());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Interrupted by main thread");
			}
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		System.out.println("Main-creating object of child class");
		//new
		ThreadLifeCycleDemo demo=new ThreadLifeCycleDemo();
		Thread thread=new Thread(demo);
		
		System.out.println("Main invoking child function");
		//runnable
		thread.start();
		try {
			//As soon as main goes to sleep child thread will be active
			//and will get its work done
			Thread.sleep(2000);
			
			//interrupt() method interrupted child thread and hence it would go to catch block
			//in child thread for that iteration
			//thread.interrupt();
			
			//thread.stop();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main finished");

	}

}
