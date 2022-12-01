package com.java.pageexecution;

import org.openqa.selenium.By;

import com.java.commonutils.CommonUtils;
import com.java.pagefactory.HomePageFactory;

public class HomePageExecution extends CommonUtils{

	HomePageFactory hp = new HomePageFactory();
    
	public void userName(String name) {

		CommonUtils.type(elemenFinder(locaterFindById(hp.username)), name);
	}
	
	public void password(String name) {
		CommonUtils.type(elemenFinder(locaterFindById(hp.password)), name);
	}
	
	public void login() {
		CommonUtils.elementclick(elementFindByXpath(hp.login));
	}
	
}
