package com.learning.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		HDTV t1=new HDTV(43,"Toshiba");
		HDTV t2=new HDTV(65, "Sony");
		HDTV t3=new HDTV(55, "Panasonic");
		HDTV t4=new HDTV(32, "LG");

		
		List<HDTV> tvList=new ArrayList<HDTV>();
		
		tvList.add(t1);
		tvList.add(t2);
		tvList.add(t3);
		tvList.add(t4);
		
		CompareTV compareTV=new CompareTV();
		
		//We are using sort method from java.util.Collections class
		//to sort the list of objects
		//We are passing the list as first param and object of the class
		//which has compareTo method as a second param
		//this object in turn invokes compare method from its body
		Collections.sort(tvList, compareTV);
		
//		for(HDTV tv:tvList)
//		{
//			System.out.println(tv.getBrand());
//		}
		
		ListIterator<HDTV> tvIterator=tvList.listIterator();
		while(tvIterator.hasNext())
		{
			System.out.println(tvIterator.next().getBrand());
		}
	}

}
