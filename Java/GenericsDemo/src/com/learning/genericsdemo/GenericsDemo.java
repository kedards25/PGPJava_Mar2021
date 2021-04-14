package com.learning.genericsdemo;

public class GenericsDemo <T> 
{

	T val;
	
	public GenericsDemo(T val) {
		this.val=val;
	}
	
	void showVal()
	{
		System.out.println("value of generic variable: "+val);
	}
	
	public static void main(String[] args) {

		GenericsDemo<Integer> demo=new GenericsDemo(5);
		GenericsDemo<Double> demo2=new GenericsDemo<Double>(57.25);
		GenericsDemo<Character> demo3=new GenericsDemo<>('A');
		
		demo.showVal();
		demo2.showVal();
		demo3.showVal();
	}

}
