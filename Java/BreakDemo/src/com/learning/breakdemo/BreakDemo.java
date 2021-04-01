package com.learning.breakdemo;

public class BreakDemo {

	public static void main(String[] args) {
		
		int num=0,i;
		
		for(i=1;i<10;i++)
		{
			if(i%3==0)
			{
				//if condition is satisfied then
				//loop will break and code execution will stop
				break;
			}
			num++;		//1  2
		}
		
		System.out.println("num: "+num);
	}

}
