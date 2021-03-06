package com.milan.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentImplTest {

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}

//	@Before
//	public void setUp() throws Exception 
//	{
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test
	public void testStoreStudents() 
	{
		StudentImpl impl=new StudentImpl();
		assertNotNull("StudentImpl should not be null", impl);
		Student robert = new Student("robert","100");
		
		assertNotNull("Student should not be null", robert);
		assertEquals("robert",robert.getName());
		assertEquals("100", robert.getCwid());
		
		impl.storeStudents(robert);
		
		Student robert1 = new Student("robert","100");
		impl.storeStudents(robert1);
		
		assertFalse(robert1 == robert);
		assertTrue(robert.equals(robert1));
		

		assertNotNull(impl.retrieveStduents());
		
		assertEquals(1, impl.retrieveStduents().size());
		
		

	}

//	@Test
//	public void testRetrieveStduents() {
//		fail("Not yet implemented");
//	}

}
