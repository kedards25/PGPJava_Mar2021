package com.learning.generictypeinferencedemo;

public class GenericTypeInferenceDemo<M,N> 
{

	M val1;
	N val2;
	
	public GenericTypeInferenceDemo(M v1,N v2) {
		
		val1=v1;
		val2=v2;
		
	}
	
	M getVal1()
	{
		return val1;
	}
	
	N getVal2()
	{
		return val2;
	}
	
	
	public static void main(String[] args) {

		GenericTypeInferenceDemo<Integer,Double> demo=new GenericTypeInferenceDemo(15, 25.27);
		System.out.println("First Val: "+demo.getVal1()+" Second Val: "+demo.getVal2());

		GenericTypeInferenceDemo<Character,String> demo2=new GenericTypeInferenceDemo('X', "Text");
		System.out.println("First Val: "+demo2.getVal1()+" Second Val: "+demo2.getVal2());
	}

}
