package com.learning.testsuitedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultTestClass {

	Calculator calc=new Calculator();
	@Test
	public void MultTest() {
		int mult=calc.multi(10,5);
		assertEquals(50,mult);
		
	}

}
