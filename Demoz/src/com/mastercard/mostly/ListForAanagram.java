package com.mastercard.mostly;

import java.util.*;

public class ListForAanagram {

	public static void main(String[] args) {
		String arr[] = { "TEA", "EAT", "ATE", "LOL", "OLL" };
		List<ArrayList<String>> ll=anagram(arr);
		for(ArrayList<String > l:ll) {
			System.out.println(l);
		}

	}

	private static List<ArrayList<String>> anagram(String[] arr) {
		// List of String which contains all string
		// Map with number and as number
		List<ArrayList<String>> list = new ArrayList();
		Map<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (String s : arr) {
			int sum = 0;
			for (char c : s.toCharArray()) 
				sum = sum + c;
			if (map.containsKey(sum)) {
				map.get(sum).add(s);
			}
			else {
				ArrayList<String> clist=new ArrayList<String>();
				clist.add(s);
				map.put(sum, clist);
			}
			
		}
		for(ArrayList<String> ll:map.values()) {
			list.add(ll);
		}
		return list;
		
		

	}

}
