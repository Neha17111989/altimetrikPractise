package com.Predefined.functional;

import java.util.function.Function;

public class FunctionInterfPredefined {

	public static void main(String[] args) {
		Function<String, Integer> fun=s->s.length();
		
		Integer len=fun.apply("neha");
		System.out.println("Length is "+len);

	}

}
