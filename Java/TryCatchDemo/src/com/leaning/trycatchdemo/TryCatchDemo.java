package com.leaning.trycatchdemo;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		int [] arr= {5,7,2,3,4};
		
		try
		{
			for (int i = 0; i < 8; i++) {
				System.out.println(arr[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: "+e);
		}
	}

}
