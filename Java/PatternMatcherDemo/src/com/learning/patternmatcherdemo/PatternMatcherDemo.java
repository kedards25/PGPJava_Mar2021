package com.learning.patternmatcherdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {

	public static void main(String[] args) {
		String val="hello";
		
		Pattern pattern=Pattern.compile("hello");
		
		Matcher matcher=pattern.matcher(val);
		
		if(matcher.matches())
		{
			System.out.println("Pattern matched in given String");
		}
		else
		{
			System.out.println("Pattern did not match in given String");
		}
	}

}
