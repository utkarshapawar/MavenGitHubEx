package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;

class MyAppTest {

	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */
	
	@Test
	void testShow() {
		MyApp m=new MyApp();
		String s=m.show();
		Assertions.assertEquals("hello Maven", s);
		
	}	
	@Test
	void testAdd()
	{
		int result=Calculator.add(100, 200);
		Assertions.assertEquals(300,result);//expected,actual
		Assertions.assertEquals(300,Calculator.add(100, 200),"testing add method" );//expected,actual,optional msg
		Assertions.assertNotEquals(100,result);
	}
	
	@Test
	void testAssertFalse()
	{
		Assertions.assertFalse("Akash".length()==10);
		Assertions.assertFalse(10>20,"compare");
	}
	@Test
	void testAssertNull()
	{
		String s1=null;
		String s2="abc";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}

	
	
}
