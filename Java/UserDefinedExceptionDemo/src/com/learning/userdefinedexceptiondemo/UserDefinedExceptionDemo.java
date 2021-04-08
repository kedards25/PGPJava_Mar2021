package com.learning.userdefinedexceptiondemo;

class DivideByZeroException extends Exception
{
	DivideByZeroException(String msg)
	{
		super(msg);
	}
}

public class UserDefinedExceptionDemo {
	
	int val1=5,val2=0;
	
	void divideNums()
	{
		try {
			if(val2==0)
			{
				throw new DivideByZeroException("Divisor cannot be zero");
			}
			else
			{
				System.out.println((val1/val2));
			}
		}catch (DivideByZeroException e) {
			//DivideByZeroException e=new DivideByZeroException("Divisor cannot be zero")
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		UserDefinedExceptionDemo demo=new UserDefinedExceptionDemo();
		demo.divideNums();
	}

}
