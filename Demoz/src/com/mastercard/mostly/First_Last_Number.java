package com.mastercard.mostly;

public class First_Last_Number {

	public static void main(String[] args) {
		int x=12345;
		/*
		 * String s=String.valueOf(x); System.out.println(s); for(int
		 * i=0;i<s.length();i++) { if(i==0) System.out.println(s.charAt(i)); else
		 * if(i==s.length()-1) System.out.println(s.charAt(i)); }
		 */
		find(x);

	}

	private static void find(int x) {
	
		int last=x%10; //remainder
		int first_digit=x;
		while(first_digit >= 10)//1234
		{
			first_digit = first_digit / 10; //123//12/1
		}
		System.out.println("first_digit is "+first_digit+"Lst one is " +last);
		
	}

}
