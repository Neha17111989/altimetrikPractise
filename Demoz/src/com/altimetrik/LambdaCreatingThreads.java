package com.altimetrik;

public class LambdaCreatingThreads {

	public static void main(String[] args) {
		Runnable  runnable=()->{
			for(int i=0;i<5;i++) {
				System.out.println("child thread : "+i);
			}
		};
		Thread t=new Thread(runnable);
		t.start();
	}
}
