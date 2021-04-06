package com.learning.staticpolymorphismdemo;

//it is called as static polymorphism because
//methods are already aware of parameters they are going to receive
//hence each method knows when to execute
//params are already bound to methods and hence it is also called as 
//early-binding
//static polymorphism takes place in one class only
public class StaticPolymorphismDemo {

	//method without params
	void showVal()
	{
		System.out.println("Hello from no-arg method");
	}
	
	//method with int param
	void showVal(int val)
	{
		System.out.println("Hello from int param method: "+val);
	}
	
	//method with floating param
	void showVal(float val)
	{
		System.out.println("Hello from floating param method: "+val);
	}
	
	
	public static void main(String[] args) {
		
		StaticPolymorphismDemo demo=new StaticPolymorphismDemo();
		demo.showVal();
		demo.showVal(5);
		//among double and float java considers double
		//as default type for floating values
		//so we need to cast it to float using 'F' prefix
		demo.showVal(7.5F);

	}

}
