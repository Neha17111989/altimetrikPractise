package com.altimetrik.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFirstFilterDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(8);
		list.add(9);
		list.forEach(System.out::println);

		Iterator<Integer> itr = list.iterator();
		Stream<Integer> ll = list.stream();
		List<Integer> resultList = ll.filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(resultList);
		resultList.forEach(x -> System.out.println(x));
		resultList.forEach(System.out::println);
		// ll.forEach(x->System.out.println(x));
		Collection cool;
		// Iterable<Object> obj=cool.iterator();
	}

}
