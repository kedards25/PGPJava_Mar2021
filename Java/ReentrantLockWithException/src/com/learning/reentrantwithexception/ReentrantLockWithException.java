package com.learning.reentrantwithexception;

import java.sql.Time;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockWithException implements Runnable {

	final ReentrantLock rLock=new ReentrantLock();
	
	@Override
	public void run() {
		//if an exception is raised in the lock
		//then lock will never be released and hence 
		//we should use try..catch and finally block
		//rLock.lock();
		
		//if we want to check if lock has been acquired or not
		//then we can use trylock
		//which may accept  parameters to set timeout to acquire the
		//lock failing which thread won't be able to acquire the lock
		
		//if(rLock.tryLock(2000,TimeUnit.milliseconds))	=> throws checked exception 
		//InterruptedException which has to be caught using try-catch block
		if(rLock.tryLock())
		{
		System.out.println(Thread.currentThread().getName()+" in try block");
		try {
			//we are purposely throwing an exception
			throw new Exception();
		} catch (Exception e) {
			
			System.out.println(Thread.currentThread().getName()+" Exception occurred");
		} finally {
			rLock.unlock();
			System.out.println(Thread.currentThread().getName()+" is releasing lock");
		}
		}
		
	}
	
	public static void main(String[] args) {
		
		ReentrantLockWithException reLock=new ReentrantLockWithException();
		Thread t1=new Thread(reLock);
		Thread t2=new Thread(reLock);
		Thread t3=new Thread(reLock);

		t1.start();
		t2.start();
		t3.start();
		
	}

	

}
