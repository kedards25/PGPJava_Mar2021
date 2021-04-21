package com.learning.testsuitedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTestClass {

	Calculator calc=new Calculator();

	
	@Test
	public void addTest()
	{
		int sum=calc.add(10,5);
		assertEquals(15, sum);
	}
}
