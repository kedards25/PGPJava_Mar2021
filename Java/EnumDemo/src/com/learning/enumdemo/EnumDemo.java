package com.learning.enumdemo;

enum Colors{Red,Orange,Purple,Blue};

public class EnumDemo {

	void showColor(Colors color)
	{
		switch(color)
		{
			case Red:
					System.out.println("You chose Red color");
					break;
			case Orange:
					System.out.println("You chose Orange color");
					break;
			case Blue:
					System.out.println("You chose Blue color");
					break;
			case Purple:
					System.out.println("You chose Purple color");
					break;
		}
	}
	
	public static void main(String[] args) {
		
		EnumDemo enumDemo=new EnumDemo();
		enumDemo.showColor(Colors.Purple);
		
		

	}

}
