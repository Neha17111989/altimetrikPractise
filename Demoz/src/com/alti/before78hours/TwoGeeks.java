package com.alti.before78hours;

import java.util.HashMap;

public class TwoGeeks {

	public static void main(String[] args) {
		String s1 = "Geeks", s2 = "Geek";
		String s3 = s1 + s2;
		char[] ch = s3.toCharArray();
		HashMap<Character, Integer> map = new HashMap();
		for (int i = 0; i <= ch.length; i++) {

			if (map.containsKey(ch[i])) {
				map.put(ch[i], 1);

			}
			else {
				map.put(ch[i], map.get(ch[i])+1);
			}
			
		}

		/*
		 * String rev=""; System.out.println(s1); for(int i=s1.length()-1;i>=0;i--) {
		 * rev=rev+s1.charAt(i); } System.out.println(rev);
		 */
		/*
		 * int i=0; int s1Len=s1.length()-1; int s2Len=s2.length()-1; CharSequence
		 * che=s1.substring(); System.out.println(che);
		 */
	}

}
