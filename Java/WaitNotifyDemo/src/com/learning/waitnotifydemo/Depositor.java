package com.learning.waitnotifydemo;

public class Depositor implements Runnable{

Account accHolder;
	
	//constructor is receiving 
	//object of Account class as parameter
	public Depositor(Account account) {
		accHolder=account;	//accHolder=person
	}
	@Override
	public void run() {
		
		//accessing deposit method from Account class
		//through object we have received in constructor
			//person.deposit(7000);
			accHolder.deposit(7000);		
		
	}
}
