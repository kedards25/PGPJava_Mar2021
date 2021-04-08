package com.learning.quantifiersdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifiersDemo {

	public static void main(String[] args) {
		
		String txt="Sankalp is smart boy and Sankalp is clever boy too..";
		String[] txtSplit=txt.split(" ");
		Pattern pattern=Pattern.compile("San.+");
		for (String str : txtSplit) {
			Matcher mat=pattern.matcher(str);
			System.out.println("San found in word "+str+" : "+mat.matches());
		}

	}

}
