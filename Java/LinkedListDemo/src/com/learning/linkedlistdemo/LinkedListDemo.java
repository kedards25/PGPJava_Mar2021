package com.learning.linkedlistdemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	//This will create doubly linked list by default
	//by creating object of parent class 
	//we are hiding the implementation of child class thus achieving
	//encapsulation
	List<Integer> linkedLst=new LinkedList();
	
	void addObjects()
	{
		linkedLst.add(new Integer(1001));
		linkedLst.add(new Integer(1002));
		linkedLst.add(new Integer(1003));
		linkedLst.add(new Integer(1002));
	}
	
	void showElements()
	{
		ListIterator<Integer> iterator=linkedLst.listIterator();
//		while (iterator.hasNext()) {
//			//Integer integer = (//Integer) iterator.next();
//			System.out.println(iterator.next());
//		}
		System.out.println(linkedLst);
	}
	public static void main(String[] args) {
		LinkedListDemo listDemo=new LinkedListDemo();
		listDemo.addObjects();
		listDemo.showElements();
	}

}
