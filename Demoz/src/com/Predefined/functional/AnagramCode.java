package com.Predefined.functional;

import java.util.Arrays;

public class AnagramCode {

	public static void main(String[] args) {
		if(isAnagram("keep","peek")) {
			System.out.println("same");;
		}else {
			System.out.println("not same");
		}
		

	}

	private static boolean isAnagram(String string, String string2) {
		if(string.length()!=string2.length()) {
			return false;
		}
		char[] Arr1=string.toCharArray();
		char[] Arr2=string2.toCharArray();
		Arrays.sort(Arr1);
		Arrays.sort(Arr2);
		return Arrays.equals(Arr1, Arr2);
	}

}
