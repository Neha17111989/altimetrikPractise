package com.mastercard.mostly;

public class LongestSubStringPal {

	public static void main(String arg[]) {
		String str = "ABCDCBAHJTSMS";
		StringBuffer rev = new StringBuffer(str).reverse();
		String str1 = rev.toString();
		System.out.println(str1);
		
		String str2 = "", str3 = "";
		int large = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			
			for (int j = i; j <= str.length() - 1; j++) {
				
				str2 = str.substring(i, j);
				
				if (str1.contains(str2)) {
				//	System.out.println("STR1 "+str1);
				//	System.out.println("STR2 "+str2);
					if (large < str2.length()) {
						str3 = str2;
						large = str2.length();
					}
				}

			}

		}
		System.out.println("Largest Palyndrom SubString is:" + str3 + " length is: " + large);

	}

}