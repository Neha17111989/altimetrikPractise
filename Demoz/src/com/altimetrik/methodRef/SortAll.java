package com.altimetrik.methodRef;

public class SortAll {

	public static void main(String[] args) {
		isSort("abac1010@tyme*_#");
	}

	private static void isSort(String string) {
		StringBuffer alpha = new StringBuffer(), digit = new StringBuffer(), special = new StringBuffer();
		
		for (int i = 0; i < string.length() - 1; i++) {
			
			if (Character.isDigit(string.charAt(i))) {
				digit.append(string.charAt(i));
			} else if (Character.isAlphabetic(string.charAt(i))) {
				alpha.append(string.charAt(i));
			} else {

				special.append(string.charAt(i));
			}
		}
		System.out.println("Numbers : "+digit);
		System.out.println("charachter : "+alpha);
		System.out.println("special  : "+special);
	}

}
