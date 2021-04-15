package com.learning.waitnotifydemo;

public class WaitNotifyDemo {

	public static void main(String[] args) {
		
		//Object of account class who is trying to withdraw money
		Account Aniket=new Account();
		
		//withdrawer and depositor are sharing common object of Account
		Withdrawer withdrawer=new Withdrawer(Aniket);
		Depositor depositor=new Depositor(Aniket);
		
		Thread withThread=new Thread(withdrawer);
		Thread depoThread=new Thread(depositor);
		
		withThread.setPriority(10);
		
		withThread.start();
		depoThread.start();

	}

}
