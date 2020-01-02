package com.altimetrik.master;

public class PallindromString {

	public static void main(String[] args) {
		String name="NEHA";
		Boolean re=isPallindrom(name);
		if(isPallindrom(name)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("Not palindrom");
		}
	}

	private static boolean isPallindrom(String name) {
		int i=0 ; int j=name.length()-1;
		//o<4,1<4
		
		while(i<j) {
			if(name.charAt(i)!=name.charAt(j)) 
				return false;
			i++;j--;
			
		}
		return true;
		
	}

}
