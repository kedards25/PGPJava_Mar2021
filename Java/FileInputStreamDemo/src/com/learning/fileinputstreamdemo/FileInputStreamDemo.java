package com.learning.fileinputstreamdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		int i;
		char c;
		
		try(FileInputStream fis=
				new FileInputStream("D:\\Professional\\NIIT\\Online Sessions\\PGP Java Mar 2021\\Java\\demoFile2.txt"))
		{
			while((i=fis.read())!=-1)
			{
				c=(char)i;
				System.out.print(c);
			}
			
		}
		catch (IOException e) {
			
			System.out.println("IOException occurred: "+e.getMessage());
			
		}

	}

}
