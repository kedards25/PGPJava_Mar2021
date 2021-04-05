package com.learning.extendsimplementsdemo;

interface DemoP
{
	int num=7;
}
class DemoP2
{
	void show()
	{
		System.out.println("Hello from DemoP2");
	}
}

public class ExtendsImplementsDemo extends DemoP2 implements DemoP{

	void show()
	{
		super.show();
		System.out.println("Value from interface: "+num);
	}
	
	public static void main(String[] args) {
		
		ExtendsImplementsDemo demo=new ExtendsImplementsDemo();
		demo.show();

	}

}
