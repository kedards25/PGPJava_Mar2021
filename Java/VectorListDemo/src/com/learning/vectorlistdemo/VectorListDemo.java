	package com.learning.vectorlistdemo;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorListDemo {

	//The only difference between Vector class and other two i.e.
	//LinkedList and ArrayList is that the vector list is synchronized
	//means only one thread can access the list at a time
	//whereas LinkedList and ArrayList are not synchronized.
	public static void main(String[] args) {
		 List<Double> vectrLst=new Vector<Double>();
		 
		 vectrLst.add(new Double(4.5));
		 vectrLst.add(new Double(7.2));
		 vectrLst.add(new Double(2.8));
		 vectrLst.add(new Double(9.5));
		 
		 System.out.println("Elements stored in object: "+vectrLst);
		 
		 ListIterator<Double> iterator=vectrLst.listIterator();
		 
		 while (iterator.hasNext()) {
			 //typecasting the object into double variable 
			 //and displaying it
			Double doubleVal =  iterator.next();
			
			System.out.println(doubleVal);
		}
		 

	}

}
