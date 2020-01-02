package com.altimetrik.methodRef;

public class FictorialDemo {

	public static void main(String[] args) {
		int num=5,i=1;
		int count = 1;
		while(i<=num) {
			count=+count*num;
			num--;
		}
		/*
		 * for(int i=1;i<=num;i++) { count = count*i; }
		 */
		System.out.println("Fictorial of 5 is : "+count);

	}

}
