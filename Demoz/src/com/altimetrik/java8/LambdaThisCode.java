package com.altimetrik.java8;

interface XYZ {

	public void m1();
	default int sum(int a, int b) {
		
		System.out.println("data: "+a+b);
		return a+b;
	}
}

public class LambdaThisCode {

	int x=11;
	public void m2() {
		int y=90;
		XYZ obj=()->{
			int z=90;
			System.out.println(x);
			System.out.println(y);
			System.out.println(++z);
		};
		obj.m1();
		obj.sum(11, 22);
	}
	public static void main(String[] args) {
		
		LambdaThisCode obj=new LambdaThisCode();
		obj.m2();
		
	}

}
