package com.selenium.rev;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.java.commonutils.CommonUtils;

public class ScreenShot extends CommonUtils {
	
	public static void takeScreenshot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File f1 = new File("Z:\\Automation Testing\\"+"name.png");
		FileHandler.copy(screenshot, f1);
		
	}

	public static void main(String[] args) throws IOException {
		
		CommonUtils.browserLaunch("chrome");
		CommonUtils.browserMax();
		CommonUtils.urlLaunch("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ScreenShot.takeScreenshot();
		
	}
	
}
