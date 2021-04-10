package com.learning.filereaderdemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		try(FileReader fr=
				new FileReader("D:\\Professional\\NIIT\\Online Sessions\\PGP Java Mar 2021\\Java\\demoFile.txt"))
		{
			char[] a=new char[50];
			
			fr.read(a);
			for(char c:a)
			{
				System.out.print(c);
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
