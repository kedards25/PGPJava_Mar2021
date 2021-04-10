package com.learning.bufferedwriterdemo;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class BufferedWriterDemo {

	public static void main(String[] args) {
	
		try(BufferedWriter b=
				new BufferedWriter(new OutputStreamWriter(System.out)))
		{
			String []fruits= {"Apple","Oranges","Guava"};
			b.write("Names of Fruits are: \n");
			for (int i = 0; i < fruits.length; i++) {
				b.write(fruits[i]);
				b.newLine();
				b.flush();
			}
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
