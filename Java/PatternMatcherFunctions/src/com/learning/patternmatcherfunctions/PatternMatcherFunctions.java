package com.learning.patternmatcherfunctions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherFunctions {

	public static void main(String[] args) {
		
//		String s1="Sample Text";
//		Pattern pat=Pattern.compile(s1);
//		String s2=pat.pattern();
//		System.out.println(s2);
		
		//Split Function
		
//		Pattern pat=Pattern.compile(":");
//		//pat object will search for ':' in the string given below
//		//and then separate the string into two using split function
//		//based on':'
//		String[] splitArr=pat.split("One:Two:Three",2);
//		for(String splitVal:splitArr)
//		{
//			System.out.println(splitVal);
//		}
		
//		Pattern pat=Pattern.compile("Sankalp");
//		Matcher matcher=pat.matcher("Sankalp is smart boy and Sankalp is clever too..");
//		
//		StringBuffer s3=new StringBuffer();
//		while(matcher.find())
//		{
//			matcher.appendReplacement(s3, "Avdhoot");
//			System.out.println(s3.toString());
//		}
		
//		Pattern pat=Pattern.compile("Sankalp");
//		Matcher matcher=pat.matcher("Sankalp is smart boy and Sankalp is clever too.. ");
//		
//		StringBuffer s3=new StringBuffer();
//		while(matcher.find())
//		{
//			matcher.appendReplacement(s3, "Avdhoot");
//			System.out.println(s3.toString());
//			
//			
//		}
//		//helping us to print the whole statement
//		matcher.appendTail(s3);
//		System.out.println(s3.toString());

		
		//replace functions
//		Pattern pat=Pattern.compile("Sankalp");
//		Matcher matcher=pat.matcher("Sankalp is smart boy and Sankalp is clever too..");
//		//returns string whereas appendtail returns stringbuffer
//		String s3=matcher.replaceAll("Shubham");
//		System.out.println(s3);
		
//		Pattern pat=Pattern.compile("Sankalp");
//		Matcher matcher=pat.matcher("Sankalp is smart boy and Sankalp is clever too..");
//	
//		String s3=matcher.replaceFirst("Shubham");
//		System.out.println(s3);
		
		//Position using functions
//		Pattern pat=Pattern.compile("Sankalp");
//		Matcher matcher=pat.matcher("Avdhoot is smart boy and Sankalp is clever too..");
//		
//		while(matcher.find())
//		{
//			System.out.println("Match started at char position: "+matcher.start());
//		}
		
		//Position using functions
		Pattern pat=Pattern.compile("Sankalp");
		Matcher matcher=pat.matcher("Avdhoot is smart boy and Sankalp is clever too..");
		
		while(matcher.find())
		{
			System.out.println("Match ended at char position: "+matcher.end());
		}
	}

}
