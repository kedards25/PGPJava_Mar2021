package com.learning.hashtabledemo;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableDemo {

//	HashTable
//	Unordered collection of objects which cannot 		
//	contain null object
//	This is Synchronized
	public static void main(String[] args) {
		
		Map<Integer, String> dataMap=new Hashtable();
		
		dataMap.put(101, "Tanvi Varak");
		dataMap.put(106,"Tanvi Gharte");
		dataMap.put(104,"Tanvi Patil");
		dataMap.put(103, "Sankalp Angchekar");
		dataMap.put(105, "Tejas Pednekar");
		dataMap.put(102, "Amogh Haldankar");
		
		System.out.println(dataMap);

	}

}
