package com.learning.tdd_demo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TddDemoTest {

	TddDemo demo=new TddDemo();
	
	@Ignore
	@Test
	public void test() {
//		fail("Not yet implemented");
		System.out.println("Hello from testCase");
	}

	@Test
	public void addTest()
	{
		System.out.println("in addTest()");
		int ans=demo.add(5,5);
		assertEquals(10, ans);
	}
}
