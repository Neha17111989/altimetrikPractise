package com.alti.before78hours;

public class ReverseWithoutInbuilt {

	
	public static void main(String[] args) {
		check("NEHA");
		//StringBuilder s=check("NEHA");
		//System.out.println(s);

	}

	private static void check(String string) {
		//int i=0,j=string.length();
		char ch[]=string.toCharArray();
		//StringBuilder s=new StringBuilder();
		for(int j=string.length()-1;j>=0;j--) {
			System.out.println(string.charAt(j));
			//System.out.println(ch[j]);
		}
		//s.append(string);
		//return s.reverse();
		
	}

}
