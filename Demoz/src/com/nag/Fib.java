package com.nag;

import java.util.Arrays;

public class Fib {

	public static void main(String[] args) {

		// Fictorial
		int i = 1, range = 10;
		int result = 1;
		while (i <= range) {
			result = result * i;
			i++;
		}
		System.out.println(result);

		// Anagram
		AnagramCheck("Keep", "neet");
		// Palindrom
		if (Palindrom("MADAM")) {
			System.out.println("yes palindrom");
		} else {
			System.out.println("Not palindrommm");
		}
		// Fibinoci
		int t1 = 0, t2 = 1, limit = 10;
		for(int i2=0;i2<=limit;i2++) {
			System.out.print(t1 +" : ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}
		System.out.println("\n");

	}

	private static boolean Palindrom(String string) {
		int i = 0, j = string.length() - 1;
		while (i < j) {
			if (string.charAt(i) != string.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;

	}

	private static void AnagramCheck(String string, String string2) {
		char ch1[] = string.toLowerCase().toCharArray();
		char ch2[] = string2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1, ch2)) {
			System.out.println("Yes equals");
		} else
			System.out.println("NO");

	}

}
