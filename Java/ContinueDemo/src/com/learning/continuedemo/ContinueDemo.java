package com.learning.continuedemo;

public class ContinueDemo {

	public static void main(String[] args) {
		int num=0,i;
		
		for(i=1;i<10;i++)
		{
			if(i%3==0)
			{
				//if condition is satisfied then
				//loop will skip subsequent steps and will return back
				//to beginning of loop
				continue;
			}
			num++;		//1  2    3  4    5	 6
		}
		
		System.out.println("num: "+num);
	}

	}


