package com.learning.abstractiondemo;

abstract class MyAbstractClass
{
	//Abstract class will have abstract and non-abstract methods
	//methods with no body is called as abstract method
	//if the class contains any abstract method then class
	//also has to be declared abstract
	abstract void show();
	
	void disp()
	{
		System.out.println("Method from abstract class");
	}
	//as the class contains abstract method,the class is said to be 
	//incomplete class and hence we cannot create object of abstract
	//class
	//in order to complete this class,we have to inherit it
	//and override abstract method in child
}

public class AbstractionDemo extends MyAbstractClass {

	@Override
	void show()
	{
		System.out.println("Overridden method in child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAbstractClass demo=new AbstractionDemo();
		demo.show();
		demo.disp();
	}

}
