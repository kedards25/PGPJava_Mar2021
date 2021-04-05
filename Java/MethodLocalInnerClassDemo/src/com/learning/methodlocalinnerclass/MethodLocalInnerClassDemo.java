package com.learning.methodlocalinnerclass;

public class MethodLocalInnerClassDemo {

	private int num=7;
	
	void invokeMethod()
	{
		class DemoClass
		{
			void showVal()
			{				
				System.out.println("private value from outer class: "+num);
			}
		}
		
		DemoClass demo=new DemoClass();
		demo.showVal();
	}
	
	public static void main(String[] args) {
		MethodLocalInnerClassDemo demo=new MethodLocalInnerClassDemo();
		demo.invokeMethod();

	}

}
