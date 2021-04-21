package com.learning.tddexceptiondemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TddExceptionTest {

	TddExceptionDemo demo=new TddExceptionDemo();
	
	@Test(expected = ArithmeticException.class)
	public void divideTest() {
		demo.divide(10,0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void divideTest2() {
		
		assertEquals(5.0, demo.divide(10,2));
		
	}

}
