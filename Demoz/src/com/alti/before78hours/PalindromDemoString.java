package com.alti.before78hours;

public class PalindromDemoString {

	public static void main(String[] args) {
	//boolean result=	isPalin("NITIN");
	if(isPalin("NITIN")) {
		System.out.println("Yes its palindrom");
	}
	else {
		System.out.println("NOT");
	}
	}

	private static boolean isPalin(String string) {
		int i=0,j=string.length()-1;
		while(i<j) {
			if(string.charAt(i)!=string.charAt(j))
				return false;
			i++;
			j--;
			
		}
		return true;
		
	}

}
