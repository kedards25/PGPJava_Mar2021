package com.learning.encapsulationdemo;

public class EncapsulationDemo {

	//in order to maintatain encapsulation
	//it is advised to declare variables as private 
	//and methods accessing the variables as public
	
	private int num;
	
	//methods are called as getters and setters
	public void setNum(int val)//setter method
	{
		num=val;
	}
	
	public int getNum()	//getter method
	{
		return num;
	}
	
	public static void main(String[] args) {
		
		EncapsulationDemo demo=new EncapsulationDemo();
		demo.setNum(10);
		//int x=demo.getNum()
		//System.out.println(x);
		System.out.println(demo.getNum());

	}

}
