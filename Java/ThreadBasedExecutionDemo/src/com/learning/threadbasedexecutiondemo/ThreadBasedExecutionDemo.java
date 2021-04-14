package com.learning.threadbasedexecutiondemo;

//To implement threading we need to either inherit Thread class
//or runnable interface,we should use runnable interface because
//it will allow us to inherit a class along with it,if required.
public class ThreadBasedExecutionDemo implements Runnable {

	//in order to implement threading in our program 
	//we need to override run method from Runnable interface
	public void run()
	{
		System.out.println("Hello from run method");
	}
	
	public static void main(String[] args) {

		System.out.println("Main function started");
		
		System.out.println("Main creating object of class");
		//creating object of the class
		ThreadBasedExecutionDemo demo=new ThreadBasedExecutionDemo();
		
		//we have to pass reference of class
		//to constructor of thread class which is
		//a child class of Runnable interface
		Thread th=new Thread(demo);
		
		//Start method invokes run() from program
		System.out.println("Main invoking function");
		th.start();
		
		System.out.println("Main finished");
		
	}

}
