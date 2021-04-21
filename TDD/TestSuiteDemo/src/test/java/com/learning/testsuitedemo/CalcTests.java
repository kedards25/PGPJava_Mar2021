package com.learning.testsuitedemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddTestClass.class, DivTestClass.class,
	MultTestClass.class, SubTestClass.class })
public class CalcTests {

}
