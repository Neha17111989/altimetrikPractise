package com.altimetrik.java8;
@FunctionalInterface
public interface StaticMethodInterface {

	public static void m5() {
		System.out.println("m1 is static method()");
	}
	public static void m2() {
		System.out.println("m1 is static method()");
	}
	public static void m3() {
		System.out.println("m1 is static method()");
	}
	public static void m4() {
		System.out.println("m1 is static method()");
	}
	public default void m1() {
		System.out.println("m1 is static method()");
	}
	
	public void m9();
}
