package com.alti.before78hours;

import java.util.HashMap;
import java.util.Map;

public class Q2_wordCount {

	public static void main(String[] args) {

		RepeatingNames("this this is by saket saket");
	}

	private static void RepeatingNames(String string) {
		String arr[] = string.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length ; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		for(Map.Entry<String, Integer> c:map.entrySet()) {
			System.out.println(c.getKey()+" "+c.getValue());
		}

	}

}
