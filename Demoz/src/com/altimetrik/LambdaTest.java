package com.altimetrik;

import java.util.*;
import java.util.stream.Stream;

public class LambdaTest {
	public void publicMethod() {
		Integer localVariable1 = 10;
		Thread t = new Thread(() -> System.out.println(localVariable1));
		t.start();
		List<Integer> list = Arrays.asList(1, 12, 3, 4);

		Collections.sort(list, (p1, p2) -> p1.compareTo(p2));
		list.forEach(x -> System.out.println(x));
	}

	public static void main(String[] args) {

		Stream.of("78","0","1", "2", "3", "4", "5") // source
				.filter(s -> s.startsWith("1")) // intermediate operation
				.map(String::toUpperCase) // intermediate operation
				.sorted() // intermediate operation
				.forEach(System.out::println); // terminal operation
	}
}