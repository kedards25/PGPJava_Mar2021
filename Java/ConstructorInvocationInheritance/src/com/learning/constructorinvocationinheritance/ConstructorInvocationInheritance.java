package com.learning.constructorinvocationinheritance;

class DemoP
{
		int val;
		
		DemoP()
		{
			val=7;
		}
		
		DemoP(int x)
		{
			val=x;
		}
}

public class ConstructorInvocationInheritance extends DemoP{

	int num;
	
	ConstructorInvocationInheritance()
	{
		//call to the super class constructor is given by default
		//in case of no-arg constructor
		//super();	//in order to call constructor of parent(no-arg)
		num=5;
	}
	
	ConstructorInvocationInheritance(int y,int z)
	{
		//call to the super class constructor has to be given explicitly
		//in case of parameterized constructor
		//call to super has to be first statement of constructor
		super(z);
		num=y;
		//super(z);		==>error
	}
	
	void show()
	{
		System.out.println("Values from parent and child are: "+val+" "+num);
	}
	public static void main(String[] args) {
		ConstructorInvocationInheritance demo=new ConstructorInvocationInheritance(8,11);
		demo.show();
	}

}
