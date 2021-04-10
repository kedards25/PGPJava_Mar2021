package com.learning.bufferedreaderdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		try(BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Enter first number");
			String s1=br.readLine();
		
			System.out.println("Enter second number");
			String s2=br.readLine();
			
			int ans=Integer.parseInt(s1)+Integer.parseInt(s2);
			
			System.out.println("Sum: "+ans);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
