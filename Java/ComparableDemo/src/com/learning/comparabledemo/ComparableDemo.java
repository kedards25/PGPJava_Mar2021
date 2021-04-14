package com.learning.comparabledemo;


public class ComparableDemo {

	public static void main(String[] args) {
		HDTV t1=new HDTV(43, "LG");
		HDTV t2=new HDTV(55, "SONY");

		//We are invoking compareTo method using t1 object
		//and passing t2 as a parameter
		if(t1.compareTo(t2)>0)
		{
			System.out.println(t1.getBrandName()+" is better than "+t2.getBrandName());
		}
		else{
			if(t1.compareTo(t2)<0)
			{
				System.out.println(t2.getBrandName()+" is better than "+t1.getBrandName());
			}
			else
			{
				System.out.println("Both are equal");
			}
		}
	}

}
