package com.Predefined.functional;

public class PallindromReverse {

	public static void main(String[] args) {
		isPallindrom("MEHTA NEHA IS PUNE");

	}

	private static void isPallindrom(String string) {
		String rev="";
		for(int j=string.length()-1;j>=0;j--) {
			rev=rev+string.charAt(j); 
			
		}
		System.out.println(rev);
		/*
		 * if(rev.equals(string)) { System.out.println("same"); } else {
		 * System.out.println("NO"); }
		 */
	}

}
