package com.altimetrik;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ArrayElementCount {
	public static void main(String[] args) {
		int arr[]=new int[] {12,12,4,5,5,7,7,8,99,99,0};
		findRepeated(arr);

	}

	private static void findRepeated(int[] name) {
		//char arr[] = name.toCharArray();
		ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap();
		
		for (int i = 0; i < name.length; i++) {
			if (!map.containsKey(name[i])) {
				map.put(name[i], 1);
			} else {
				map.put(name[i], map.get(name[i])+1);

			}
		}

		Set<Integer> keys = map.keySet();
		for (Integer c : keys) {
			if(map.get(c)>0) {
			System.out.println(c+" "+map.get(c));
			}
			
		}
		System.out.println("------------------");
		for (Integer c : keys) {
			
			//System.out.println("-------------");
			if(map.get(c)>1) {
				map.remove(c);
			}
		}
		System.out.println(map.keySet());

	}

}
