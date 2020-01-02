package com.altimetrik.master;

import java.util.Arrays;

public class AnaGram {

	public static void main(String[] args) {
		String[] arr = { "TEA", "EAT", "TALK", "LKTA", "NIT", "TIN", "PHONE" };
		if(isAnagram(arr)) {
			System.out.println("matched");
		}
		else {
			System.out.println("non matched");
		}
		
		/*
		 * if (isAnagram("keep", "peek")) { System.out.println("yes"); } else {
		 * System.out.println("NO"); }
		 */
	}

	private static boolean isAnagram(String[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				char c1[] = arr[i].toCharArray();
				System.out.println(c1);
				char c2[] = arr[j].toCharArray();
				//System.out.println(c2);
				Arrays.sort(c1);
				Arrays.sort(c2);
				if (Arrays.equals(c1, c2))

				{
					flag = true;

				}
				// return true
			}

		}
		return flag;

	}

	private static boolean isAnagram(String string, String string2) {
		boolean status = true;
		char arr[] = string.toCharArray();
		char arr2[] = string2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr2);

		return Arrays.equals(arr, arr2);
		/*
		 * if(string.length()!=string2.length()) { return false; } else { char
		 * a1[]=string.toCharArray(); char a2[]=string2.toCharArray();
		 * //Arrays.sort(a1); //Arrays.sort(a2); if(Arrays.equals(a1, a2)) {
		 * status=true; } } return status;
		 */

	}

}
