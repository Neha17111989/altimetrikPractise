package com.alti.before78hours;

public class SingletonDemo {

	public static void main(String[] args) {
		SingletonClass obj=SingletonClass.getInstance();
		SingletonClass obj2=SingletonClass.getInstance();
		System.out.println(obj.hashCode() );
		System.out.println(obj2.hashCode() );
		

	}

}
