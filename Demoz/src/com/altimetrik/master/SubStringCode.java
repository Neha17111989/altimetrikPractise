package com.altimetrik.master;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class SubStringCode {
	public static void main(String[] args) {
		isLongestSubString("javaodeabcs");

	}

	private static void isLongestSubString(String string) {
		/*
		 * char[] c = string.toCharArray(); int leng=0; String subPart=null;
		 * LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character,
		 * Integer>(); for (Character ch : c) { if (!map.containsKey(ch)) { map.put(ch,
		 * 1); } else { map.put(ch, map.get(ch)+1); map.clear(); } } if(map.size()>leng)
		 * { leng=map.size(); subPart=map.keySet().toString(); }
		 * System.out.println("String is : "+string
		 * +" substring is "+subPart+" its length "+leng); //return false; // TODO
		 * Auto-generated method stub
		 */
		final String input = "A0BB";

		final int answer = Arrays.stream(input.split("[0-9]+"))
		    .filter(s -> s.matches("(.+)?[A-Z](.+)?"))
		    .sorted((s1, s2) -> s2.length() - s1.length())
		    .findFirst()
		    .orElse("")
		    .length();

		System.out.println(answer);
	}
}
