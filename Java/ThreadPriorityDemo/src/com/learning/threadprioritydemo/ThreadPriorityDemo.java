package com.learning.threadprioritydemo;

public class ThreadPriorityDemo implements Runnable {
	

	@Override
	public void run() {

			System.out.println(Thread.currentThread().getName()+"-i");

	}
	public static void main(String[] args) {
	
		System.out.println("From main");
		ThreadPriorityDemo demo=new ThreadPriorityDemo();
		Thread thread1=new Thread(demo);
		Thread thread2=new Thread(demo);
		Thread thread3=new Thread(demo);
		Thread thread4=new Thread(demo);
		
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		thread3.setName("Thread 3");
		thread4.setName("Thread 4");
		
		System.out.println("Setting priority of thread");
		
		//NORM_PRIORITY value=5
		//MAX_PRIORITY value=10
		//MIN_PRIORITY value=1
				
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.NORM_PRIORITY-2);
		thread3.setPriority(Thread.NORM_PRIORITY+2);
		thread4.setPriority(Thread.MIN_PRIORITY);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();	
		
	}

}
