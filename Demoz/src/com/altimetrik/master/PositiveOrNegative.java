package com.altimetrik.master;

public class PositiveOrNegative {

	public static void main(String[] args) {
		double numb=-88.00;
		if(numb>0.0) {
			System.out.println("no is +ve");
		}
		else {
			System.out.println("no is -ve");
		}
		char c='*';
		String  respondse=(c>='a'&&c>='z')||(c>='A'&&c>='Z')
				? c+ "is alphabets" 
				: c+ "not alphabets";
		System.out.println(respondse);
		int i='a';
		System.out.println(i);
	}
}
