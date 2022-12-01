package com.java.pageexecution;

import com.java.commonutils.CommonUtils;
import com.java.pagefactory.HomeWithPF;

public class HomeWithPFExecution extends CommonUtils {

	public void username(String name) {
		HomeWithPF hp = new HomeWithPF();
		CommonUtils.type(hp.username, name);
	}
	
	public void password(String name) {
		HomeWithPF hp = new HomeWithPF();
		CommonUtils.type(hp.password, name);
	}
	
	public void login() {
		HomeWithPF hp = new HomeWithPF();
        CommonUtils.elementclick(hp.login);
	}
	
}
