package com.mastercard.mostly;

import java.util.HashMap;
import java.util.Map;

public class ExtraCharacterFindOut {

	public static void main(String[] args) {
		String s1="Geeks";
		String s2="Geek";
		String s3=s1.toLowerCase()+s2.toLowerCase();
		System.out.println(s3);
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		char[] ch=s3.toCharArray();
		for(int i=0;i<s3.length();i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				map.put(ch[i], 1);
			}
		}
		for(Character m:map.keySet()) {
			int val=map.get(m);
			if(val%2!=0) {
				System.out.println(m);
			}
			
			
			}
		}
		

	//}

}
