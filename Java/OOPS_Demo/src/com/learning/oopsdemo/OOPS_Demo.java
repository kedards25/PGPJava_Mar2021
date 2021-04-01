package com.learning.oopsdemo;

import java.util.Scanner;

public class OOPS_Demo {

	int num;
	
	Scanner sc=new Scanner(System.in);
	
	void acceptNum()
	{
		System.out.println("Enter any number");
		num=sc.nextInt();
	}
	
	void dispNum()
	{
		System.out.println("The value entered: "+num);
	}
	
	public static void main(String[] args) {
		
		OOPS_Demo demo=new OOPS_Demo();
		
		demo.acceptNum();
		
		demo.dispNum();
		

	}

}
