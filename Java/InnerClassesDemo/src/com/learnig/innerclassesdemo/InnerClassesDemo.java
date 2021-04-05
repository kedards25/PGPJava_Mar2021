package com.learnig.innerclassesdemo;

public class InnerClassesDemo {
	
	private int val=7;
	
	class DemoClass
	{
		void showVal()
		{
			System.out.println("private value from outer class: "+val);
		}
	}
	
	void invokeMethod()
	{
		DemoClass demo=new DemoClass();
		demo.showVal();
	}

	public static void main(String[] args) {
		InnerClassesDemo demo1=new InnerClassesDemo();
		demo1.invokeMethod();

	}

}
