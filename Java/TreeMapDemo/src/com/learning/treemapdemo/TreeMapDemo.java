package com.learning.treemapdemo;


import java.util.*;

public class TreeMapDemo {

//	Map Interface
//	Which is not part of collections 
//	It belongs to java.util package
//	Map works on Key-Value pair
//  TreeMap does not allow null values as Keys but allows n number of null values as values
	public static void main(String[] args) {
		Map<Integer, String> dataMap=new TreeMap();
		
		dataMap.put(101, "Tanvi Varak");
		dataMap.put(106,"Tanvi Gharte");
		dataMap.put(104,"Tanvi Patil");
		dataMap.put(103, null);
		dataMap.put(105, "Sankalp Oversmart");
		dataMap.put(102, null);
		
//		System.out.println(dataMap);
//		System.out.println();
		
		//entrySet method returns Set interface which is enabling the 
		//dataMap which is of type Map to be viewed as Collection(Collection-View)
		//it will sort the data implicitly and allow us to view dataMap as Set Interface
//		System.out.println(dataMap.entrySet());
//		System.out.println();
//		
//		for(Map.Entry<Integer, String> data:dataMap.entrySet())
//		{
//			System.out.println(data.getKey()+"  "+data.getValue());
//		}

		//fetching keys of dataMap and assigning them to object of Set interface
		//and hence it will not allow duplicate values
		Set<Integer> keySet=dataMap.keySet();
		
//		Iterator keyIterator=keySet.iterator();		
//		while(keyIterator.hasNext())
//		{
//			System.out.println(keyIterator.next());
//		}
		
		//iterating through keySet using forEach loop
		for(int k:keySet)
		{
			
			//MapObj.get(key)=>returns data mapped with given key
			System.out.println(k+" "+dataMap.get(k));
		}

	}

}
