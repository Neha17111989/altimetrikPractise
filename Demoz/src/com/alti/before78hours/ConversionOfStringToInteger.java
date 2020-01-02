package com.alti.before78hours;

import java.util.Collections;

public class ConversionOfStringToInteger {

	public static void main(String[] args) {
		int num=1314;
		String s=String.valueOf(num);
		//System.out.println(s);
		//Collections.frequency(c, o)
		
		String name="Neha Mehta";
		name=name.replaceAll("\\s", "");
		System.out.println(name);
		
		//Logic one
		char[] ch=name.toCharArray();
		String eliminate = "";
		for(int i=0;i<name.length();i++) {
			if(ch[i]!=' ') {
				eliminate=eliminate+ch[i];
			}
		}
		System.out.println(eliminate);
		

	}

}
