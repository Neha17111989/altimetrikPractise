package com.alti.before78hours;

public class Integerpallindrom {

	public static void main(String[] args) {
		Integer num = 1221;
		if(NumberPalindrom(num)) {
			System.out.println("yes ");
		}else {
			System.out.println("NO");
		}

	}

	private static boolean NumberPalindrom(Integer num) {
		String s = String.valueOf(num);
		System.out.println(s);
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;

	}

}
