package com.learning.testsuitedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivTestClass {

	Calculator calc=new Calculator();
	
	@Test
	public void divTest() {
		int res= calc.div(10,5);
		assertEquals(2, res);
	}

}
