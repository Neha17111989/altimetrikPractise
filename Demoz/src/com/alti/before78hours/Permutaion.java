package com.alti.before78hours;

public class Permutaion {

	public static void main(String[] args) {
		check("JSP");

	}

	private static void check(String string) {
		check("",string);
		
	}

	private static void check(String permuataion, String string) {
		if(string.length()==0) {
			System.out.println(permuataion);
		}
		else {
			for(int i=0;i<string.length();i++) {
				//System.out.println(string.charAt(i));
				//System.out.println("hi : "+string.substring(0, i)+": ");
				//System.out.println(string.substring(i+1, string.length()));
				check(permuataion+string.charAt(i), 
						string.substring(0, i)+string.substring(i+1, string.length()));
			}
		}
		
	}

}
