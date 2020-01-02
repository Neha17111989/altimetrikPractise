package com.alti.before78hours;

public class String_Palindrom {

	public static void main(String[] args) {
		String name="NITIN";
		boolean result=isPalindron(name);
		if(result) {
			System.out.println("its palindrom");
		}
		else {
			System.out.println(" not its palindrom");
		}

	}

	private static boolean isPalindron(String name) {
		int i=0, j=name.length()-1;
		//char ch[]=name.toCharArray();
		while(i<j) {
			if(name.charAt(i)!=name.charAt(j)) 
				return false;
			i++;j--;
		}
		return true;
		
		
	}

}
