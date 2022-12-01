package com.java.prj;

public class AbstractImplementation extends AbstractionEx{

	@Override
	protected
	void m1() {
		System.out.println("m1");
	}
	
	
	
	
	public static void main(String[] args) {
		
		AbstractImplementation ex = new AbstractImplementation();
		ex.m1();
	    ex.cal();
		
	}

	
	
}
