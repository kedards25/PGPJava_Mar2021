package com.learning.nestedclassesdemo;



public class NestedClassesDemo {
	
	private static int val=7;
	
	static class DemoClass
	{
		static void showVal()
		{
			System.out.println("private value from outer class: "+val);
		}
	}
	
	void invokeMethod()
	{
		DemoClass.showVal();
	}

	public static void main(String[] args) {
		NestedClassesDemo demo1=new NestedClassesDemo();
		demo1.invokeMethod();

	}

}
