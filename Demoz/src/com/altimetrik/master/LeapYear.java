package com.altimetrik.master;

public class LeapYear {
	public static void main(String[] args) {
		if (isLeap(1900)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

	private static boolean isLeap(int i) {
		if (i % 4 == 0) {
			if (i % 100 == 0) {
				return true;
			} else {
				return false;
			}
		}
		return false;

	}
}
