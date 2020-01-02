package com.alti.before78hours;

import java.util.HashMap;
import java.util.Map;

public class WordOccurencePattern {

	public static void main(String[] args) {
		RepeatingNames("this this is by saket saket");

	}

	private static void RepeatingNames(String string) {
		String[] ch = string.split(" ");
		for (int i = 0; i < string.length(); i++) {
			System.out.println(ch[i]);
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < string.length(); i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			} else {
				map.put(ch[i], map.get(ch[i]) + 1);
			}
		}
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}

}
