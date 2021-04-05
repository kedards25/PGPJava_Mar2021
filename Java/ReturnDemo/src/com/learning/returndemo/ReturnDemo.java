package com.learning.returndemo;

public class ReturnDemo {
	
	//when we want to pass value from one function to another
	//we can return the value and the type of the value the function 
	//is returning ,is called as return type of the function
	//if function is not returning anything then the return type would be
	//void
	
	public void show()		//called function
	{
		System.out.println("hello from void function");
	}
	
	public int showVal()
	{
		System.out.println("hello from called function");
		return 7;
	}

	public static void main(String[] args) {
		
		ReturnDemo demo=new ReturnDemo();
		demo.show();		//calling function
		int rcvdVal=demo.showVal();
		System.out.println("value returned by function: "+rcvdVal);
	}

}
