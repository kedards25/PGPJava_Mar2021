package com.learning.processbasedexecutiondemo;

public class ProcessBasedExecution {

	void showMsg()
	{
		System.out.println("Hello from method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("From main function");
		
		System.out.println("Main creating object of class");
		
		ProcessBasedExecution demo=new ProcessBasedExecution();
		
		System.out.println("Main invoking child function");
		
		demo.showMsg();
		
		System.out.println("Main finished execution");

	}

}
