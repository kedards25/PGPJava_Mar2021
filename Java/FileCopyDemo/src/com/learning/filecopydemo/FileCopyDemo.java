package com.learning.filecopydemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopyDemo {

	public static void main(String[] args) {
		Path trgPath=Paths.get("D:\\Professional\\NIIT\\Online Sessions\\Java Morning 9-11\\testfile2.txt");
		Path srcPath=Paths.get("D:\\Professional\\NIIT\\Online Sessions\\testfile2.java");
		
		try {
			Files.copy(srcPath, trgPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
