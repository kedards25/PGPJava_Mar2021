package com.learning.thisdemo;

public class ThisDemo {

	String val;
	
	void showVal(String val)
	{
		this.val=val;
		System.out.println("The value received: "+this.val);
	}
	
	public static void main(String[] args) {
		
		ThisDemo thisDemo=new ThisDemo();
		thisDemo.showVal("Test");

	}

}
