package com.mastercard.mostly;

import java.util.ArrayList;
import java.util.List;

public class CustomSortString {

	public static void main(String[] args) {
		String[] s= {"My","name","is ","don"};
		List<String> ll=new ArrayList<String>();
		for(int i=0;i<s.length;i++) {
			ll.add(s[i].toLowerCase());
		}
		System.out.println(ll);
		ll.stream().sorted((a,b)->-a.compareTo(b)).forEach(System.out::println);
		
		

	}

}
