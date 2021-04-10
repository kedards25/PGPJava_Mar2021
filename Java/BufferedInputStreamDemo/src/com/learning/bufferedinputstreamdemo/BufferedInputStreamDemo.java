package com.learning.bufferedinputstreamdemo;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		String s="Welcome to Java";
		byte[] b=s.getBytes();
		
//		try(ByteArrayInputStream in=new ByteArrayInputStream(b);
//				BufferedInputStream bis=new BufferedInputStream(in)) 
		try(BufferedInputStream bis=
				new BufferedInputStream(new ByteArrayInputStream(b)))
		{
			int c;
			while((c=bis.read())!=-1)
			{
				System.out.print((char)c);
			}
		} catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}

	}

}
