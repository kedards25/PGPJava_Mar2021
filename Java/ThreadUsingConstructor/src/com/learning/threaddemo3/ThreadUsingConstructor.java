package com.learning.threaddemo3;

public class ThreadUsingConstructor implements Runnable {

	//object of thread class declared here

	Thread th;
	
	public ThreadUsingConstructor() {
		System.out.println("Thread being initialized in constructor");

		//object being initialized in constructor
		//reference of class constructor is given to Thread class constructor using
		//this keyword
		th=new Thread(this);	//object of thread class is referring to current class
		System.out.println("invoking run method using object of Thread in constructor");
		//invoking run method using object of Thread
		th.start();
//		System.out.println("Is child thread active in constructor??"+th.isAlive());
	}
	
	
	public void run()
	{
		System.out.println("Thread invoked using constructor");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		System.out.println("Main creating object of class");
		
		ThreadUsingConstructor demo=new ThreadUsingConstructor();
		
		System.out.println("Main finished");
//		System.out.println("Is child thread active in main??"+demo.th.isAlive());
	}

}
