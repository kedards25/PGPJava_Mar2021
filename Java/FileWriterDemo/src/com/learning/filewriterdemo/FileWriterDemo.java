package com.learning.filewriterdemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		try(FileWriter f=
				new FileWriter("D:\\Professional\\NIIT\\Online Sessions\\PGP Java Mar 2021\\"
						+ "Java\\sampleFile.txt"))
		{
			String s="New way to write file";
			char []buffer=new char[s.length()];
			s.getChars(0, s.length(), buffer, 0);
			f.write(buffer);
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
