package com.altimetrik;

import java.util.*;

public class RepeatedCharacter {

	public static void main(String[] args) {

		findRepeated("javaisjava");

	}

	private static void findRepeated(String name) {
		char arr[] = name.toCharArray();
		HashMap<Character, Integer> map = new HashMap();
		
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i])+1);

			}
		}

		Set<Character> keys = map.keySet();
		for (Character c : keys) {
			if(map.get(c)>1) {
			System.out.println(c+" "+map.get(c));
			}
			
		}

	}

}
