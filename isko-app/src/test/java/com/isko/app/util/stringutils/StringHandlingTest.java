package com.isko.app.util.stringutils;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHandlingTest {

	String example;
	String exampleTrim;
	StringBuffer exampleBuffer;
	
	@Before
	public void setUp() throws Exception 
	{
		example = "JAVA CLASS";
		exampleTrim = "JAVA CLASS        ";
		exampleBuffer = new StringBuffer(exampleTrim);
		
	}

	@Test
	public void testLength() 
	{
		assertEquals(10, example.length());
		
	}
	
	@Test
	public void testTrim() 
	{
		assertEquals(10, exampleTrim.trim().length());
		System.out.println(exampleTrim);
		System.out.println(exampleTrim.length());
		assertEquals(18, exampleTrim.length());
		exampleTrim.concat("extra");
		assertEquals("JAVA CLASS        extra",exampleTrim);
		
	}
	
	
	
	
	@Test
	public void testTrimStringBuffer() 
	{
		assertEquals(18, exampleBuffer.length());
		exampleBuffer.append("extra");
		//assertTrue("JAVA CLASS        extra".equals(exampleBuffer));
		System.out.println(exampleBuffer);

	}

}
