package com.testng.rev;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;



public class Retry {

	
	@Test(retryAnalyzer = RetryAna.class )
	public void Ret() {
		assertTrue(false);
	}
	
}
