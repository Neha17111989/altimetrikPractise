package com.altimetrik.master;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonClass obj=SingletonClass.getInstance();
		System.out.println(obj);
		SingletonClass obj2=SingletonClass.getInstance();
		System.out.println(obj2);
		if(obj==obj2) {
			System.out.println("same");
		}
		
	}

}
