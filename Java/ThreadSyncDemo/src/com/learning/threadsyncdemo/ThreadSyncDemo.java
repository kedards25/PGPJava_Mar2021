package com.learning.threadsyncdemo;

public class ThreadSyncDemo implements Runnable {

	/*Synchronization makes sure that one thread gets access of resource at one time.
	 * Keyword to use is "Synchronized"
	In our case,the method that we want to be accessed by one thread only
	should be prefixed with synchronized keyword*/
	synchronized public void disp()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
		System.out.println();
	}
	@Override
	public void run() {
		
		disp();
		
	}
	
	public static void main(String[] args) {
		ThreadSyncDemo demo=new ThreadSyncDemo();
		Thread thread1=new Thread(demo);
		Thread thread2=new Thread(demo);
		
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		
		thread1.start();
		thread2.start();
		

	}

	

}
