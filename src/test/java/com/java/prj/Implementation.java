package com.java.prj;

public class Implementation implements IinterfaceEx {

	@Override
	public void abstractmethod() {
		System.out.println("abstract");	
	}
	
	
	
	public static void main(String[] args) {
		
		Implementation io = new Implementation();
		io.abstractmethod();
		
		
		
		
		
	}

	
	
}
