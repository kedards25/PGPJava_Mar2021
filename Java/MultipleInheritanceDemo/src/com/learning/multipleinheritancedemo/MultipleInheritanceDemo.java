package com.learning.multipleinheritancedemo;

interface DemoP
{
	//methods in interface are public abstract by default
	//we cannot declare any variable in an interface
	//but it can have constants within
	int NUM=5;
}

interface DemoP2
{
	//methods in interface are public abstract by default
	//we cannot declare any variable in an interface
	//but it can have constants within
	void show();
}

//if a class implements an interface then it has to override the 
//abstract methods from it 
public class MultipleInheritanceDemo implements DemoP,DemoP2{

	//in order to override method in child class 
	//method signature has to be same as that of parent class
	public void show()
	{
		System.out.println("Overridden method in child "+NUM);
	}
	
	public static void main(String[] args) {
		
		DemoP2 demo=new MultipleInheritanceDemo();
		demo.show();

	}

}
