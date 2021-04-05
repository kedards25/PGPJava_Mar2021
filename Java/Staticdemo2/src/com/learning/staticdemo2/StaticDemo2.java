package com.learning.staticdemo2;

public class StaticDemo2 {

	int val=5;
	static int val2=7;
	
	//non-static methods can access static and non-static both
	void addVal()
	{
		System.out.println(val+val2);
	}
	
	//static methods can access only static variables
//	static void addVal2()
//	{
//		System.out.println(val+val2);
//	}
			
	
	public static void main(String[] args) {
		
		StaticDemo2 demo=new StaticDemo2();
		demo.addVal();
	}

}
