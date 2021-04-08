package com.learning.throwsdemo;

public class ThrowsDemo {

	void divide(int n1,int n2) throws ArithmeticException
	{
		int ans=n1/n2;
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		
		ThrowsDemo demo=new ThrowsDemo();
		
		try
		{
			demo.divide(5, 0);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
