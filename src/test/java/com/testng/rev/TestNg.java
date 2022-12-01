package com.testng.rev;

import org.junit.Ignore;
import org.slf4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.java.commonutils.CommonUtils;

public class TestNg extends CommonUtils{

	Logger log = loadLog(TestNg.class);

//	@BeforeSuite
//	public void me1() {
//		System.out.println("suite");
//	}
//
//	@BeforeTest
//	public void me2() {
//		System.out.println("test");
//	}
//
//	@BeforeClass
//	public void me3() {
//		System.out.println("class");
//	}
//
//	@BeforeMethod
//	public void me4() {
//		System.out.println("class");
//	}

//    @Parameters({"browser"})
//	@Test(priority = 1)
//	public void test01(String name) {
//		System.out.println(name);
//	}

//	@Test(dataProvider = "datap" )
//	public void test02(String name, String pass) {
//		System.out.println(name+" "+ pass);
//	}
//	
//	 @DataProvider
//		public Object[][] datap(){
//			Object[][] d = {{"tawfeek","feek"}};
//			return d;
//		}
//	 
	
	
	

//	@Test(dataProvider = "datap")
//	public void test03(String name, String pass) {
//		System.out.println(name+" "+ pass);
//	}

   
    
}
