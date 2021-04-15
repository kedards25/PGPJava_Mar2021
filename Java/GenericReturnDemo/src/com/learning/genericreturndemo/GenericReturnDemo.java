package com.learning.genericreturndemo;

public class GenericReturnDemo<T>{
	
	T val;
	
	public GenericReturnDemo(T num) {
		val=num;
	}

	T getVal()
	{
		return val;
	}
	
	public static void main(String[] args) {
		GenericReturnDemo<Integer> demo=new GenericReturnDemo(50);
		System.out.println("Value received in main: "+demo.getVal());
	}

}
