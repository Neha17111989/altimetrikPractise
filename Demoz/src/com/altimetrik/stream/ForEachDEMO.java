package com.altimetrik.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDEMO {

	public static void main(String[] args) {
		List<String> ll = Arrays.asList("neha", "mehta", "veer", "nitin", "aman", "avi", "pushkar");
		Consumer<String> consumer = System.out::println;
		// List lm=ll.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		// lm.forEach(consumer);;
		// long data = ll.stream().count();
		// System.out.println(data);
		ll.forEach(consumer);

		HashMap<String, Integer> map = new HashMap<>();
		Consumer<String> keysConsumer = System.out::println;
		Consumer<Integer> valueConsumer = System.out::println;
		Consumer<Map.Entry<String, Integer>> KVpair = System.out::println;
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		map.values().forEach(valueConsumer);
		map.entrySet().forEach(KVpair);

		// custom iterator
		Consumer<Map.Entry<String, Integer>> maps = entryset -> {
			System.out.print("key :"+entryset.getKey());
			System.out.println(" Value :"+entryset.getValue());
		};
		map.entrySet().forEach(maps);

	}

}
