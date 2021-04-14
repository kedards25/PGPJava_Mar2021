package com.learning.genericreturntypedemo;

public class GenericReturnTypeDemo {

	
	public <T> T dispNum(T num)
	{
		return num;
	}
	
	public static void main(String[] args) {
		
		GenericReturnTypeDemo demo=new GenericReturnTypeDemo();

		System.out.println("Generic Int value: "+demo.dispNum(5));
		System.out.println("Generic String value: "+demo.dispNum("Sample"));
		System.out.println("Generic float value: "+demo.dispNum(5.5F));
	}

}
