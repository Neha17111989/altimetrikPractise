package com.altimetrik.master;

public class SingletonClass {

	private static SingletonClass obj = null;

	private SingletonClass() {
	}

	/*
	 * public static synchronized SingletonClass getInstance() { if (obj == null) {
	 * obj = new SingletonClass(); } return obj; }
	 */
	
	public static SingletonClass getInstance() {
		if(obj==null) {
			synchronized (SingletonClass.class) {
				if(obj==null) {
					return obj=new SingletonClass();
				}
			}
		}
		return obj;
	}

}
