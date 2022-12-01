package com.testng.rev;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.testng.TestNG;

public class TestNg2 {
	
//	@BeforeGroups("smoke")
//	public void test0() {
//		System.out.println("Smoke Group");
//	}
//	
//	
//
//	@Test(groups = "smoke",dependsOnMethods = "test02")
//	public void test01() {
//		System.out.println("test01");
//	}
//	
//	@Test(groups = "sanity")
//	public void test02() {
//		System.out.println("test02");
//	}
//	
//	@Test(groups= {"smoke"})
//	public void test03() {
//		System.out.println("test03");
//	}
//	
//	@Test(dataProvider = "datap", dataProviderClass = TestNG.class)
//	public void test04(String name,String pass) {
//		System.out.println(name +" "+ pass);
//	}
	
	@Test(dataProvider="method" ,invocationCount = 100)
	public void test03d(String name) {
		System.out.println(name);
	}
	
	@DataProvider
	public Object[][] method(){
		return new Object[][]  {{"tawfeek"}};
	}
	
}
