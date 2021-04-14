package com.learning.wildcarddemo;

public class WildCardDemo<T>
{
	private T val;
	
	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}

	//WildCardDemo<subclass of Number> wcd
	//WildCardDemo<? extends Number> wcd
	//public boolean compare(WildCardDemo<? extends DemoP> wcd)	==>any class which is subclass of DemoP
	//public boolean compare(WildCardDemo<? Super DemoC> wcd) ==>any class which is superclass of DemoC
	public boolean compare(WildCardDemo<? extends Number> wcd)
	{
		if(val==wcd.val)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		WildCardDemo<Integer> demoInt=new WildCardDemo<Integer>();
		demoInt.setVal(10);
		
		WildCardDemo<Double> demoNum=new WildCardDemo<Double>();
		demoNum.setVal(10.00);
		
		System.out.println("Comparison: "+demoInt.compare(demoNum));

	}

}
