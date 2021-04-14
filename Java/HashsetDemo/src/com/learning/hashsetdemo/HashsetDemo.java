package com.learning.hashsetdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo {

		//set interface works on values instead of indexes
		//hence it does not allow duplicate values
		//HashSet does not sort the values by default
		//hence insertion of elements is faster
			public static void main(String[] args) {
//				Set<String> hashSet=new HashSet();
//
//				//String will not be sorted alphabetically
//				hashSet.add("One");
//				hashSet.add("Four");
//				hashSet.add("Three");
//				hashSet.add("Two");
//				hashSet.add("Grass");
//				hashSet.add("Five");
				
				Set<Integer> hashSet=new HashSet();
				
//				Integer n1=new Integer(101);
//				Integer n2=new Integer(105);
//				Integer n3=new Integer(103);
//				Integer n4=new Integer(102);
//				Integer n5=new Integer(104);
//				
//				hashSet.add(n1);
//				hashSet.add(n2);
//				hashSet.add(n3);
//				hashSet.add(n4);
//				hashSet.add(n5);
				
				hashSet.add(101);
				hashSet.add(103);
				hashSet.add(102);
				hashSet.add(105);
				hashSet.add(104);
				Iterator<Integer> iterator=hashSet.iterator();
				
				while(iterator.hasNext())
				{
					System.out.println(iterator.next());
				}
				
			
	}

}
