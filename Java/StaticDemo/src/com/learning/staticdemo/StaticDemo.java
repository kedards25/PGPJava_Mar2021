package com.learning.staticdemo;

//anything declared as static is maintained
//as single copy per class
//it is advised not to use static keyword to bypass
//OOPS approach
class StaticDemo {
	
	int val=5;
	
	//if we declare variable as static then
	//only one copy per class is maintained
	static int num=7;
	
	void incrVal()
	{
		val++;
		System.out.println("From non-static function: "+val);
	}
	
	static void incrVal2()
	{
		num++;
		System.out.println("From static function: "+num);
	}
	
	public static void main(String[] args) {
		
		//each object created below will maintain 
		//its own copy of non-static variable val
		//hence each function-call thruogh an object will
		//increase value to 6
		StaticDemo demo=new StaticDemo();	//refers to val as 5
		StaticDemo demo2=new StaticDemo();	//refers to val as 5
		StaticDemo demo3=new StaticDemo();	//refers to val as 5
		
		demo.incrVal();
		demo2.incrVal();
		demo3.incrVal();
		//demo.incrVal2();
		
		System.out.println();
		//as incrVal2() is declared as static we can call
		//it without object of the class or directly with className
		//hence will operate on single copy of variable
		incrVal2();
		StaticDemo.incrVal2();
		demo.incrVal2();

	}

}
