package com.learning.abstractdemo2;

abstract class MyAbstractClass
{
	abstract void show();
	abstract void disp();
	abstract void greet();
	
}

//if child class does not override all the abstract methods
//then child also has to be declared abstract
abstract class DemoP extends MyAbstractClass
{
	void show()
	{
		System.out.println("Show method from DemoP");
	}
	
	void greet()
	{
		System.out.println("Greet method from DemoP");
	}
}

public class AbstractDemo2 extends DemoP{
	
	void disp() {
		System.out.println("disp method from child class");
	}

	void display()
	{
		System.out.println("new method in main class");
	}
	public static void main(String[] args) {
		
		DemoP demo=new AbstractDemo2();
		demo.show();
		demo.disp();
		demo.greet();
		AbstractDemo2 demo2=new AbstractDemo2();
		demo2.display();
		

	}

}
