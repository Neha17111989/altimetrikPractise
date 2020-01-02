package com.alti.before78hours;

public class Q1 {

	public static void main(String[] args) {
		System.out.println("1 method..");
		System.out.println(check("VEERZARA"));
		//System.out.println("2 method..");
		//check2("UAR");
		//System.out.println("3 method..");
		//String reverse=check3("MEHTA");
		//System.out.println(reverse);
	}

	private static String check3(String string) {
		String rev="";
		for(int i=string.length()-1;i>=0;i--) {
			rev=rev+string.charAt(i);
		}
		return rev;
		
	}

	private static void check2(String string) {
		char[] ch=string.toCharArray();
		for(int i=string.length()-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
	}

	private static StringBuilder check(String string) {
		StringBuilder builder=new StringBuilder();
		builder.append(string);
		System.out.println(builder);
		return builder.reverse();
		
	}

}
