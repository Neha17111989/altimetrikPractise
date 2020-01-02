package com.altimetrik;

import java.util.*;
import java.util.stream.Stream;

public class MethodRef {
	public void printLowerCase(String s) {
		System.out.println(s.toLowerCase());
	}

	public static void printUpperCase(String s) {
		System.out.println(s.toUpperCase());
	}

	public MethodRef() {
		System.out.println("default called here");
	}

	public void publicMethod() {
		Stream s = Stream.of(1,1,32);
		s.forEach(System.out::println);
		
	 s=	Stream.of(11,33,5,44,6,66,77,8,99,9);
	 s.forEach(System.out::println);

		/*
		 * List<String> list = Arrays.asList("A", "B", "C");
		 * list.forEach(this::printLowerCase); list.forEach(MethodRef::printUpperCase);
		 * list.forEach(String::toLowerCase); list.forEach(String::new);
		 */
	}
}