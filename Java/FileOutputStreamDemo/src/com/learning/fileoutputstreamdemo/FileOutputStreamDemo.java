package com.learning.fileoutputstreamdemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		String s="Demo data to be written on file";
		
		byte[] buf=s.getBytes();
		
		try (FileOutputStream fos=
				new FileOutputStream("D:\\Professional\\NIIT\\Online Sessions\\"
						+ "PGP Java Mar 2021\\Java\\sampleFile.txt")){
			
			for (int i = 0; i < buf.length; i++) {
				fos.write(buf[i]);
			}
			System.out.println("Done");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		
		

	}

}
