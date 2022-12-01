package com.junit.rev;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitEx {

	@BeforeClass
	public static void me() {
		System.out.println("beforeClass");
	}

	
	
//	@Test 
//	public void main() {
//		String na = "tawfek";
//		assertTrue("this is Error", na.equals("tawfeek"));
//		assertTrue("mess", na.equals(na));
//	}
//    
//	
//	@Test 
//	public void main1() {
//		String na = "tawfek";
//		assertEquals("this is Error", na, "tawfeek");
//		
//		System.out.println("Main1");
//	}
	
	@Test
	   public void testSomeMethod() {
	       assertTrue(false);
	       assertTrue(false);
	       assertTrue(false);
	   
	}
	
}
