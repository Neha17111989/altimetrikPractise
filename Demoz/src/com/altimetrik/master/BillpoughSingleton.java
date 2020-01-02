package com.altimetrik.master;

public class BillpoughSingleton {
	
	private BillpoughSingleton() {}
	private static class  innerClass{
		static final  BillpoughSingleton obj=new BillpoughSingleton();
	}
	public static BillpoughSingleton getInstance(){
		return innerClass.obj;
	}
			
}
