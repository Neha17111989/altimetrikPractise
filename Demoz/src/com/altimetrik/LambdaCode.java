package com.altimetrik;

import java.util.*;

@FunctionalInterface
interface Sayable {
	// void say();
	// int sum(int a, int b);
	String wave(String name);
}

public class LambdaCode {

	public static void main(String[] args) {
		//Sayable s=(a,b)->a+b;
		//int result=s.sum(78,1);
		//System.out.println("result of number is : "+result);
		Sayable s=(name)->{
			return "hello"+name;
		};
			System.out.println(s.wave("neha"));
			
			List<String> list=Arrays.asList("neha","divya","nitisha","ayushi");
			//list.forEach(System.out::println);
			list.forEach(x->System.out.println(x));
	}

}
