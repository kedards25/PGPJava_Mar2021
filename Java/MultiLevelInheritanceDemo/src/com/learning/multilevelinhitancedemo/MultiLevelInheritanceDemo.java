package com.learning.multilevelinhitancedemo;

interface DemoP
{
	//DemoP dp=new MultiLevelInheritanceDemo();
	void show();
}

interface DemoP2 extends DemoP
{
	DemoP2 dp2=new MultiLevelInheritanceDemo();	
	void disp();
}
public class MultiLevelInheritanceDemo implements DemoP2 {

	public void show()
	{
		System.out.println("show from DemoP");
	}
	
	public void disp()
	{
		System.out.println("disp from DemoP2");
	}
	
	public static void main(String[] args) {
//		MultiLevelInheritanceDemo demo=new MultiLevelInheritanceDemo();
//		demo.show();
//		demo.disp();
		
		
		dp2.show();
		
		
		dp2.disp();

	}

}
