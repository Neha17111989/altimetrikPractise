package com.altimetrik.methodRef;

interface XYZ{
	public void say();
}
public class MethodRef1Demo {

	static void print(){
		System.out.println("inside static!!");
	}
	public static void main(String[] args) {
	XYZ obj=MethodRef1Demo :: print;
	obj.say();

	}

}
