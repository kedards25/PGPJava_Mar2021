package com.learning.enumdemo2;



public class EnumDemo2 {

	enum Colors{Red(5),Orange(6),Purple(7),Blue(8);
		
	private	int colrCode;
		
	Colors(int val)
	{
		colrCode=val;
	}
	
	public int getCode()
	{
		return colrCode;
	}
	
	};
	public static void main(String[] args) {
		Colors colr=Colors.Blue;
		System.out.println(colr.getCode());

	}

}
