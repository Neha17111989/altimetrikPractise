package com.altimetrik.master;

import java.util.concurrent.atomic.*;

public class Test1 {
	int x = 10;
	static final int y=90;
	public static void main(String[] args) {
		System.out.println("helelo"+y);
		AtomicInteger in=new AtomicInteger(10);
		System.out.println(in.get());
		System.out.println(in.incrementAndGet());
		in.compareAndSet(11, 23);
		System.out.println(in.get());
		int arr[]= {11,22,33,44,55,66,77,88};
		System.out.println(arr[arr.length-5]);
	}
}
