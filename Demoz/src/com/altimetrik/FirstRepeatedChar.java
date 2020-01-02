package com.altimetrik;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "NITIN";
		
		char rr[]=str.toCharArray();
		 char c=getFirst(rr);
		 System.out.println("repaeted one is "+c);
		
	}

	private static char getFirst(char[] rr) {
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		char c = 0;
		for(int i=0;i<rr.length;i++) {
			if(map.containsKey(rr[i])) {
				map.put(rr[i], map.get(rr[i])+1);
				c=rr[i];
				break;
			}
				
				else {
					map.put(rr[i], 1);
					//c=rr[i];
					//break;
				}
		}
		
		return c;
		// TODO Auto-generated method stub
		
	}

}
