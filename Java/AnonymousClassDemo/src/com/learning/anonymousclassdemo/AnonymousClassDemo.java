package com.learning.anonymousclassdemo;

public class AnonymousClassDemo {

	int val=7;
	
	void convertString()
	{
		Object obj=new Object() {
			
			@Override
			public String toString()
			{
				return "String conversion : "+val;
			}
		};
		
		System.out.println(obj.toString());
	}
	
	
	public static void main(String[] args) {
		
		AnonymousClassDemo demo=new AnonymousClassDemo();
		demo.convertString();
	}

}
