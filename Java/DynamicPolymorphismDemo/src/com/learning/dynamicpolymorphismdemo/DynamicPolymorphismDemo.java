package com.learning.dynamicpolymorphismdemo;

class DemoP
{
	void showVal()
	{
		System.out.println("Method from parent class");
	}
}

public class DynamicPolymorphismDemo extends DemoP {
	//it takes place using function with same signature
	//in parent and child class
	//function call is decided at runtime
	//objects are bound to methods dynamically 
	//hence also called as late-binding
	
	void showVal()
	{
		System.out.println("Method from child class");
	}
	public static void main(String[] args) {
		
		//this is straight initialization and invocation 
//		DynamicPolymorphismDemo demo=new DynamicPolymorphismDemo();
//		demo.showVal();
		
		//this is straight initialization and invocation 
//		DemoP demo=new DemoP();
//		demo.showVal();
		
		//this is an example of dynamic polymorphism
		//object will be initialized with class at runtime
		//and hence function call would also be decided at runtime
//		DemoP dp=new DynamicPolymorphismDemo();
//		dp.showVal();
		
		//I am creating object of parent
		//DemoP dp=new DemoP();
		//to make following statement valid
		//we need to cast object of parent into child type
		//as follows
		//following lines compile successfully but throws an error 
		//at runtime
		//as this casting is valid from compilation point of view
		//but practically parent cannot access child properties
//		DynamicPolymorphismDemo demo=(DynamicPolymorphismDemo)dp;
//		demo.showVal();

		//this is called as auto-boxing
		//also known as upward-casting
		//consider putting small box into a bigger one
		//which can be done easily
		//DemoP dp=new DynamicPolymorphismDemo();
		
		//this is called as auto-unboxing
		//also known as downward-casting
		//consider putting big box into a smaller one
		//which cannot be done easily
		//DemoP dp=new DemoP();
//		DynamicPolymorphismDemo demo=(DynamicPolymorphismDemo)dp;
//		demo.showVal();
	}

}
