package com.junit.rev;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({JunitEx.class,JunitEx1.class})

public class SuiteClas {


      public static void main(String[] args) {
		
    	  Result re =JUnitCore.runClasses(JunitEx.class,JunitEx1.class);
    	  
    	  
    	  
	}
	

	
}
