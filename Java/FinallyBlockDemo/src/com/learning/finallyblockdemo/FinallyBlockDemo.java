package com.learning.finallyblockdemo;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		
	int []arr= {4,2,3,7,9};
		
	try
	{
		for (int i = 0; i<5 ; i++) {
			System.out.println(arr[i]);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("End of the Program");
	}
	}

}
