package com.learning.multicatchdemo;

public class MultiCatchDemo {

	public static void main(String[] args) {
		int [] arr= {7,2,1,4,3};
		try {
			for(int i=0;i<7;i++)
			{
				System.out.println(arr[i]);
			}
		}
		//'|' is called as pipe
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("ArithmeticException "+e);
		}
	}

}
