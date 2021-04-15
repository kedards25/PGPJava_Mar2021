package com.learning.waitnotifydemo;

public class Withdrawer implements Runnable {

	Account accHolder;
	
	//constructor is receiving 
	//object of Account class as parameter
	public Withdrawer(Account account) //Aniket object will be received as param
	{
		accHolder=account;
	}
	@Override
	public void run() {
		
		//accessing withdraw method from Account class
		//through object we have received in constructor

			accHolder.withdraw(15000);

		
		
	}
	
	
}
