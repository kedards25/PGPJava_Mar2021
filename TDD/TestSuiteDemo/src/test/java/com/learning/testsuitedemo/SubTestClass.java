package com.learning.testsuitedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubTestClass {

	Calculator calc=new Calculator();
	
	@Test
	public void subTest() {
		int ans=calc.sub(10,4);
		assertEquals(5, ans);
	}

}
