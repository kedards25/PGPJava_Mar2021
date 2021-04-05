package com.learning.paramdemo;

import java.util.Scanner;

public class ParamDemo {

	int val,val2;
	
	void show(String name)
	{
		System.out.println("Value received from param: "+name);
	}
	
	void disp(int x)
	{
		val=x;
		System.out.println("Int value received from param: "+val);
	}
	
	void dispVals(int x,int y)
	{
		System.out.println("Int values received from param: "+x+" and "+y);
	}
	
	void dispNum(int val2)
	{
		this.val2=val2;
		System.out.println("Int value received from param: "+this.val2);
	}
	
	public static void main(String[] args) {

		ParamDemo paramDemo=new ParamDemo();
		paramDemo.show("Umair");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		paramDemo.disp(num);
		
		paramDemo.dispVals(10, 20);
		
		paramDemo.dispNum(54);
	}

}
