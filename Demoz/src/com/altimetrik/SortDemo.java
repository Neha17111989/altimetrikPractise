package com.altimetrik;

import java.util.Arrays;
import java.util.*;
public class SortDemo {

	public static void main(String[] args) {
		List<String> data=Arrays.asList("B","P","A","N","M");
		//Collections.sort(data); accending orrder
		//Descending order
		Collections.sort(data, (p,q)->p.compareTo(q));
		//data.sort(Comparator.reverseOrder());
		data.forEach(System.out::println);
		
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("int data");
				
			}
		});
		th.start();
		
		Thread t=new Thread( ()-> {
			
				System.out.println("hi neha");
				System.out.println("hi java");
			});
		t.start();
		LambdaTest obj=new LambdaTest();
		//obj.publicMethod();
		
		MethodRef obj2=new MethodRef();
		obj2.publicMethod();
	}
}
