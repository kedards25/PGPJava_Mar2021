package com.learning.constructordemo;

public class ConstructorDemo {

	int val;
	
	//Constructor is special type of method used to initialize
	//member variables of the class dynamically
	//constructor cannot have any logic within
	//hence it cannot have any return type
	//it can have access-specifiers
	//if we do not provide any constructor in our code 
	//compiler creates a default constructor
	//cannot be inherited
	
	//no-arg constructor
	ConstructorDemo()
	{
		val=5;
	}
	
	//parameterized constructor 
	ConstructorDemo(int num)
	{
		val=num;
	}
	
	void dispVal() {
		System.out.println("Value from constructor: "+val);
	}
	
	public static void main(String[] args) {
		
		//constructor need not to be invoked explicitly
		//it gets invoked as soon as object of the class is created
		ConstructorDemo demo=new ConstructorDemo();
		demo.dispVal();
		
		ConstructorDemo demo2=new ConstructorDemo(12);
		demo2.dispVal();
		

	}

}
