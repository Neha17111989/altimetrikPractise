package com.altimetrik.methodRef;

public class PredefinedFunctionalInterface {

	static void boarding() {
		System.out.println("hi neha");
	}
	public static void main(String[] args) {
		Thread thread=new Thread(PredefinedFunctionalInterface::boarding);
		thread.start();

	}

}
