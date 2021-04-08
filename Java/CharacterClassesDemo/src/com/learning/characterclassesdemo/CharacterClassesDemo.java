package com.learning.characterclassesdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassesDemo {

	public static void main(String[] args) {
		
		//^[abc]	it must start either with a,b or c
		//[abc]$	it must end either with a,b or c
		Pattern pat=Pattern.compile("com[^abc]at");
		
		Matcher matcher=pat.matcher("compat");
		
		if(matcher.matches())
		{
			System.out.println("String matched");
		}
		else
		{
			System.out.println("String did not match");
		}

	}

}
