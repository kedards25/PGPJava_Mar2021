package com.learning.treesetdemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		
		//While declaring set we will create object of the Superclass
		//and initialize with child class
		//in order to hide implementation
		Set<String> numSet=new TreeSet();
		
		
		String s1=new String("One");
		String s2=new String("Two");
		String s3=new String("Three");
		String s4=new String("Four");
		String s5=new String("Five");
		
		numSet.add(s1);
		numSet.add(s2);
		numSet.add(s3);
		numSet.add(s4);
		numSet.add(s5);
		
		System.out.println(numSet);
		
//		System.out.println("Size before: "+numSet.size());
//		numSet.remove(s4);
//		numSet.clear();
//		System.out.println("Size after: "+numSet.size());
		
		Iterator i=numSet.iterator();
		if(i.hasNext())
		{
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		}
		else
		{
			System.out.println("no data");
		}

	}

}
