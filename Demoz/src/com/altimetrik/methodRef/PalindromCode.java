package com.altimetrik.methodRef;

public class PalindromCode {

	public static void main(String[] args) {
		String s="NITIN";
		boolean result=isPalindrom(s);
		if(result==true) {
			System.out.println("palindrom ");
		}
		else {
			System.out.println("Not palindrom ");
		}
		/*
		 * char[] a=s.toCharArray(); for(int i=0;i<s.length()/2;i++) { for(int
		 * j=s.length()-1;j>s.length()/2;j--) { if(!(a[i]==a[j])) {
		 * System.out.println("its pallindrom "); } else {
		 * System.out.println("not palindrom"); } } }
		 */

	}
	static boolean isPalindrom(String s){
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
