package com.learning.comparabledemo;

//compareTo method from comparable interface 
//allows us to compare two objects with each other
//and returns int value 
//positive int value means current object is greater than param object
//negative means current object is smaller than param object
//zero means both are equal

class HDTV implements Comparable<HDTV>  {

	int size;
	String brandName;
	

	public HDTV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HDTV(int size, String brandName) {
		super();
		this.size = size;
		this.brandName = brandName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public int compareTo(HDTV tv1)
	{
		//here tv1 is referring to t2
		//this is referring to t1 because we are invoking method through t1
		if(this.size>tv1.size)
		{
			return 1;
		}
		else
		{
			if(this.size<tv1.size)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
	}
	
	
	
	
	
}
