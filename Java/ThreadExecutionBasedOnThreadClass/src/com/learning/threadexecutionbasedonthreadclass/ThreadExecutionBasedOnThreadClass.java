package com.learning.threadexecutionbasedonthreadclass;



public class ThreadExecutionBasedOnThreadClass extends Thread {

	public void run()
	{
		System.out.println("Hello from run method");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main function started");
		
		System.out.println("Main creating object of class");
		
		//we need not to create object of thread class
		//as we are already inheriting it
		ThreadExecutionBasedOnThreadClass demo=new ThreadExecutionBasedOnThreadClass();
		
		//Start method invokes run() from program
		//using object of the class
		System.out.println("Main invoking function");
		demo.start();
		
		System.out.println("Main finished");
	}

}
