package com.learning.rethrowdemo;

public class RethrowDemo {
	
	int ans;
	void divide(int n1,int n2) throws ArithmeticException
	{
		if(n2==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println(n1/n2);
		}

	}
	
	void showAns()
	{
		try {
			divide(5, 0);
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Second no cannot be zero");
		}
	}
	
	public static void main(String[] args) {
		
		RethrowDemo demo=new RethrowDemo();
		
		try {
			demo.showAns();
		} catch (ArithmeticException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}

}
