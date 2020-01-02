package com.altimetrik.master;

import java.util.*;

public class FindDuplicatesInArrayDemo {

	public static void main(String[] args) {
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java", "JavaScript" };
		// 1
		System.out.println("***************************");
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("pass " + i + names[i]);
				}
			}
		}

		// 2
		System.out.println("***************************");
		Set<String> set = new HashSet<String>();
		for (String n : names) {
			if (set.add(n) == false) {
				System.out.println(n + " is duplicate name");
			}
		}

		// 3
		System.out.println("***************************");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s : names) {
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				map.put(s, map.get(s) + 1);
			}
			
		}
		//3
		Set<String> keys=map.keySet();
		for(String k:keys) {
			if(map.get(k)>1)
			System.out.println(k+""+map.get(k));
		}
	}
}
