package com.Predefined.functional;

public class PalindromCode {

	public static void main(String[] args) {
		if (ispalindrom("NITIN")) {
			System.out.println("yes palindrom");
		} else {
			System.out.println("NOPS");
		}
	}

	private static boolean ispalindrom(String string) {

		int i = 0, j = string.length() - 1;
		while (i < j) {
			if (string.charAt(i) != string.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;

	}
}
