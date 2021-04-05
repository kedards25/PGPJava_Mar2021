package com.learning.stringmethodsdemo;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String val="Sample Text";
		//System.out.println("No of characters: "+val.length());
		
		//System.out.println(val.charAt(3));
		
		
		char[] str=new char[6];
		val.getChars(7, 11, str, 0);
		for(char v:str)
			{
				System.out.print(v+"\t");
			}
		
		
//		String val2="Sample";
//		String val3="sample";
//		if(val2.equals(val3)) {
//			System.out.println("Equal");
//		}
//		else
//		{
//			System.out.println("Not Equal");
//		}
		
//		String val2="Sample";
//		String val3="sample";
//		if(val2.equalsIgnoreCase(val3)) {
//			System.out.println("Equal");
//		}
//		else
//		{
//			System.out.println("Not Equal");
//		}
		
		
//		String val2="Sample";
//		String val3="Sample";
//		int result=val2.compareTo(val3);
//		System.out.println(result);
		
//		System.out.println(val.startsWith("Sample"));
//		System.out.println(val.endsWith("Text"));
		
//		System.out.println(val.indexOf('e'));
//		System.out.println(val.lastIndexOf('e'));
		
//		System.out.println(val.substring(7));
		
//		System.out.println(val.concat(" added"));
		
//		System.out.println(val.replace('x', 's'));
		
//		System.out.println(val.toUpperCase());
		
//		System.out.println(val.toLowerCase());
		
//		String val4="   Hello   ";
//		System.out.println(val4);
//		System.out.println(val4.trim());
		
//		char[] valArr=val.toCharArray();
//		for(char v:valArr)
//		{
//			System.out.print(v+"\t");
//		}
		
		
		//to convert an variable into string we can use
		//toString() and String.valueOf() methods
		//while dealing with reference variables such as objects 
		//we shall use toString
		//while dealing with primitive data types  we shall
		//use String.valueOf();
//		int num=5;
//		System.out.println(String.valueOf(num)+7);
		
		
		
				
		

	}

}
