package com.learning.bufferedoutputstreamdemo;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
		
		try(BufferedOutputStream b=new BufferedOutputStream(System.out))
		{
			String s="Sample Text to be written on Console";
			
			byte[] buf=s.getBytes();
			
			b.write(buf);
			
			b.flush();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
