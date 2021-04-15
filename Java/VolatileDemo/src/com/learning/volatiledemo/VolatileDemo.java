package com.learning.volatiledemo;

public class VolatileDemo implements Runnable {

	volatile boolean isValid=false;

	@Override
	public void run() {
		 isValid=true;
		 System.out.println(isValid);
	}
	
	
	
	public static void main(String[] args) {
		VolatileDemo demo=new VolatileDemo();
		
		Thread th1=new Thread(demo);
		Thread th2=new Thread(demo);
//		Thread th3=new Thread(demo);
		
		th1.start();
		th2.start();
//		th3.start();

	}





}
