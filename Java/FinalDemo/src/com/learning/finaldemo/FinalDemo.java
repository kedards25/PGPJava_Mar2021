package com.learning.finaldemo;

//final class cannot be inherited

//any variable which is declared as static and final is considered to be constant 
class DemoP
{
	
	//final variable cannot be re-initialized 
	final int val=7;
	
	
	final void show() //final method cannot be overridden in child
	{
		System.out.println("Method from parent class");
	}
}

public class FinalDemo extends DemoP {

	void show()
	{
		//val=8;
		System.out.println("Method from child class "+val);
	}
	
	public static void main(String[] args) {
		
		FinalDemo demo=new FinalDemo();
		demo.show();
	}

}
