package com.altimetrik.java8;

public class StaticMethodInterfaceImpl implements StaticMethodInterface {

	public static void m5() {
		System.out.println("impl class static method()");
	}
	public static void main(String[] args) {
		
		  StaticMethodInterfaceImpl obj=new StaticMethodInterfaceImpl(); 
		  obj.m1();
		 
		StaticMethodInterface.m5();
		StaticMethodInterface obj2=StaticMethodInterface::m5;
		//obj2.m4();
		
		
	}
	public void m2() {
		System.out.println("m2 called");
		
	}
	@Override
	public void m9() {
		// TODO Auto-generated method stub
		
	}
}
