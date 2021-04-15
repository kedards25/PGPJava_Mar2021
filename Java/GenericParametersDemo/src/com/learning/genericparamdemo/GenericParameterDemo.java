package com.learning.genericparamdemo;

//public class GenericParameterDemo<T> {
//
//	  	T val1;
//	    T val2;
//	    T temp;
//	    
//	    void setNums(T num1, T num2){
//	        val1=num1;
//	        val2=num2;
//	    }
//	    
//	    void swap(){
//	    	System.out.println("Values before swapping: "+val1+" "+val2);
//	        temp=val1;
//	        val1=val2;
//	        val2=temp;
//	    	System.out.println("Values after swapping: "+val1+" "+val2);
//	    }
//	    
//	    
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		GenericParameterDemo<Integer> demo=new GenericParameterDemo();
//		demo.setNums(10, 20);
//		demo.swap();
//	}
//
//}

public class GenericParameterDemo<T,X> {

	  	T val1;
	    X val2;
	    
	    void setNums(T num1, X num2){
	        val1=num1;
	        val2=num2;
	    }
	    
	   void disp() 
	   {
		System.out.println("Values: "+val1+" "+val2);   
	   }
	    
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericParameterDemo<Integer,Double> demo=new GenericParameterDemo();
		demo.setNums(10, 20.35);
		demo.disp();
	}

}
