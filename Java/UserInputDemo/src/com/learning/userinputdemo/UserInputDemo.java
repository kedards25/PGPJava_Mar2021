package com.learning.userinputdemo;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		
		int num;	//we are declaring a variable
		double price;
		char alpha;
		String name;
		
		//instructing user to enter numeric value
		System.out.println("Enter any number");
		
		//creating object of Scanner class to accept 
		//userinput
		Scanner sc=new Scanner(System.in);
		
		//default data type of java is String
		//so we need to convert it into int by invoking a method called
		//nextInt from Scanner class
		num=sc.nextInt();
		
		System.out.println("Enter any price");
		price=sc.nextDouble();
		System.out.println("Enter any alphabet");
		alpha=sc.next().charAt(0);	//"kedar"=>'k'
		System.out.println("Enter any name");
		name=sc.next();
		
		System.out.println("The values entered: "+num+" "+price+" "+alpha+
				" "+name);
	}

}
