package com.altimetrik.master;

import java.util.Arrays;
import java.util.*;

public class SegregateArrayO1 {
	public static void main(String[] args) {
		int arr[] = new int[] { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int len = 0;
		String sub = null;
		for (Integer in : arr) {
			// System.out.println(in);
			if (!hm.containsKey(in)) {
				hm.put(in, 1);

			} else {
				hm.put(in, hm.get(in) + 1);
				// hm.clear();
			}

		}

		/*
		 * Set<Integer> keys= hm.keySet(); if(hm.size()>len) { len=hm.size();
		 * sub=hm.keySet().toString(); System.out.println("substring is "+ sub ); }
		 */
		Set<Integer> set = hm.keySet();
		for (Integer i : set) {
			if (i == 1) {
				if (hm.get(i)>=3) {
					System.out.println(i + "is repeated  " + hm.get(i));
				}
			}
		}

	}
}
