package com.java.commonutils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUtils extends SLF4J {
	
	static Logger log = loadLog(CommonUtils.class);

	public static WebDriver driver = null;

	public static void browserLaunch(String url) {
		switch(url){
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
	}

	public static void browserMax() {
		driver.manage().window().maximize();
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	public static void timeout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	public static WebElement elementFindById(String locator) {
		return driver.findElement(By.id(locator));
	}
	
	public static WebElement elementFindByName(String locator ) {
		return driver.findElement(By.name(locator));
	}
	
	public static WebElement elementFindByXpath(String locator) {
		return driver.findElement(By.xpath(locator));
	}
	
	
	
	
	public static WebElement elemenFinder(By locator ) {
		return driver.findElement(locator);
	}
	
	public static By locaterFindById(String locator) {
		return By.id(locator);	
	}
	
	public static By locaterFindByName(String locator) {
		return By.name(locator);
	}
	
	public static By locaterFindByXpath(String locator) {
		return By.xpath(locator);
	}
	
	
	

	
	public static void type(WebElement element, String name) {
		element.sendKeys(name);
	}
	
	public static void elementclick(WebElement element) {
		element.click();
	}
	
	

    public static void browserClose() {
    	driver.close();
    }


    public static String getProperty(String path, String property) throws IOException {
		File f1 = new File(path);
		if(f1.exists()) {
		  log.info("already have a file");
		}
		else{
			f1.createNewFile();
		log.info("created");
		}
		
		FileReader fr = new FileReader(f1);
	    Properties pr = new Properties();
	    pr.load(fr);
	    String st =  pr.getProperty(property);
	    System.out.println(st);
		return st;
	}
    





}
