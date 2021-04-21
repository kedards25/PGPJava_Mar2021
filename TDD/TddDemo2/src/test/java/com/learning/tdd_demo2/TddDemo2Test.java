package com.learning.tdd_demo2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TddDemo2Test {

	TddDemo2 demo=new TddDemo2();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("from setUpBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("\nfrom tearDownAfterClass()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("\nfrom setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("from tearDown()");
	}

	@Test
	public void addTest()
	{
		System.out.println("from addTest()");
		assertEquals(15, demo.add(10,5));
	}
	
	@Test
	public void subTest()
	{
		System.out.println("from subTest()");
		assertEquals(5, demo.sub(10,5));
	}

}
