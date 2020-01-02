package com.altimetrik.master;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class FindRepeatingChar {

	public static void main(String[] args) {
		countRepeated("nehamehtajava");

	}

	private static void countRepeated(String string) {
		char ch[]=string .toCharArray();
		ConcurrentHashMap<Character,Integer> map=new ConcurrentHashMap();
		for(Character c:ch) {
			if(!map.containsKey(c)) {
				map.put(c,1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
		}
		System.out.println("-------------");
		//System.out.println(map.keySet().iterator().);
		Set<Character> key=map.keySet();
		for(Character c:key) {
			if(map.get(c)>1)
			System.out.println(c +" occurs in map : "+map.get(c));
			map.remove(c);
		}
		System.out.println("************************");
		Set<Character> ol=map.keySet();
		for(Character c:ol) {
			
			System.out.println(c +" occurs in map : "+map.get(c));
			
		}
		
		
		 
	}

}
