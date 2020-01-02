package com.altimetrik;
import java.util.*;
public class LongestSubstringNonRepeatedChars {

	public static void main(String[] args) {
		subStringNonRepeated("javaabcdef");
		

	}

	private static void subStringNonRepeated(String string) {
		int length=0;
		String subPart=null;
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		char[] arr=string.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			}
			else {
				map.get(arr[i]);
				map.clear();
			}
		}
		if(map.size()>length) {
			length=map.size();
			subPart=map.keySet().toString();
		}
		 System.out.println("Input String : "+string);
         
	        System.out.println("The longest substring : "+subPart);
	         
	        System.out.println("The longest Substring Length : "+length);
		
	}
	

}
