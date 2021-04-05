package com.learning.methodcallinginheritancedemo;

//Super Keyword
//helps to access members of parent class in child 
//in case ,if the declaration is same
class DemoP
{
	void show()
	{
		System.out.println("Show method from parent class");
	}
	
	void disp()
	{
		System.out.println("Show method from parent class");
	}
}

public class MethodCallingInheritanceDemo extends DemoP {

	void show()
	{
		super.show();
		System.out.println("Show method from child class");
	}
	
	public static void main(String[] args) {
		
		MethodCallingInheritanceDemo demo=new MethodCallingInheritanceDemo();
		demo.show();

	}

}
