package com.learning.throwdemo;

public class ThrowDemo {
	
	void divide(int n1,int n2)
	{
		if(n2==0)
		{
			throw new ArithmeticException("Second number cannot be zero");
		}
		else
		{
			System.out.println(n1/n2);
		}
	}

	public static void main(String[] args) {

		ThrowDemo demo=new ThrowDemo();
		try {
			demo.divide(5, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
