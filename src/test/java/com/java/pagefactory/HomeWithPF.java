package com.java.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.java.commonutils.CommonUtils;

public class HomeWithPF extends CommonUtils {

	public HomeWithPF() {
		PageFactory.initElements(driver, this);
	}

		@FindBy(id = "email")
		public WebElement username;

//	@FindBys({
//		@FindBy(id="email"),
//		@FindBy(name = "email")
//	})
//	public WebElement username;

	
	@FindBy(id = "pass")
	public WebElement password;

	
	@FindBy(xpath = "//button[@name='login']")
	public WebElement login;

}
