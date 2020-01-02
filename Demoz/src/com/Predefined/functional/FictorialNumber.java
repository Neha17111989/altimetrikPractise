package com.Predefined.functional;

public class FictorialNumber {

	public static void main(String[] args) {
		int result=fict(5);
		System.out.println("factorial is : "+result);
	}

	private static int fict(int i) {
		int result=1,init=1;
		while(i>init) {
			result=result*i;
			i--;
		}
		return result;
		
	}

}
