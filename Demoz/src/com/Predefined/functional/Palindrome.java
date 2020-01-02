package com.Predefined.functional;

public class Palindrome {
	public static void main(String[] args) {
		int num = 121, reversedInteger = 0, remainder, originalInteger;
		originalInteger = num;
		// reversed integer is stored in variable
		while (num != 0) {
			remainder = num % 10;// Last number
			System.out.println(remainder);
			reversedInteger = reversedInteger * 10 + remainder; // 0*10+1=1
			System.out.println(reversedInteger);
			num /= 10; // Q
			System.out.println("num "+num);
		}
		// palindrome if orignalInteger and reversedInteger are equal
		if (originalInteger == reversedInteger)
			System.out.println(originalInteger + " is a palindrome.");
		else
			System.out.println(originalInteger + " is not a palindrome.");
	}
}