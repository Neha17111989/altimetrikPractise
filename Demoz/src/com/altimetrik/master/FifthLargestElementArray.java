package com.altimetrik.master;

import java.util.*;
import java.util.Collections;

public class FifthLargestElementArray {

	public static void main(String[] args) {
		Integer arr[]= {12,33,44,11,77,88,99};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-3]);
		//2
		List<Integer> ll=Arrays.asList(arr);
		Collections.sort(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(4));

	}

}
