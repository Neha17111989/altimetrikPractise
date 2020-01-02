package com.nag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomSortQ9 {

	public static void main(String[] args) {
		String arr[]={"Hello","My","name","is","Don"} ;
		List<String> ll=new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			ll.add(arr[i]);
		}
		Collections.sort(ll);
		System.out.println(ll);
		

	}

}
