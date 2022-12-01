package com.java.p1;

public class LaterBinding extends EarlyBinding {

	@Override
	void method1(int a , int b) {
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		
		LaterBinding lt  = new LaterBinding();
		lt.method1(30,20 );
		
	}
	
}
