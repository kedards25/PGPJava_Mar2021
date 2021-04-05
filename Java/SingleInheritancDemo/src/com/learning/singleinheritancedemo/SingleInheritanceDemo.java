package com.learning.singleinheritancedemo;

//child can access non-private members of parent class
class DemoP
{
	int num=7;
	void show()
	{
		System.out.println("Hello from parent");
	}
	
}

public class SingleInheritanceDemo extends DemoP {

	void disp()
	{
		System.out.println("Hello from child "+num);
	}
	public static void main(String[] args) {
		SingleInheritanceDemo demo=new SingleInheritanceDemo();
		demo.disp();
		demo.show();

	}

}
