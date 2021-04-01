package com.learning.userinputdemo;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		
		int num;	//we are declaring a variable
		
		//instructing user to enter numeric value
		System.out.println("Enter any number");
		
		//creating object of Scanner class to accept 
		//userinput
		Scanner sc=new Scanner(System.in);
		
		//default data type of java is String
		//so we need to convert it into int by invoking a method called
		//nextInt from Scanner class
		num=sc.nextInt();
		
		System.out.println("The value entered: "+num);
	}

}
