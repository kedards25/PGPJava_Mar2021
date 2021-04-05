package com.learning.enumdemo3;

enum Colors{Red,Orange,Purple,Blue};

public class EnumDemo3 {

	void showColors()
	{
		for(Colors clr:Colors.values())
		{
			System.out.println(clr);
		}
	}
	public static void main(String[] args) {
		
		EnumDemo3 demo=new EnumDemo3();
		demo.showColors();
	}

}
