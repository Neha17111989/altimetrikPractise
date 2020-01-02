package com.altimetrik.master;

public class PictorialWhile {
	public static void main(String[] args) {
		int range=5;
		int start=1,result=1;
		while(start<=range) {
			result =  result*range;
			range--;
		}
		System.out.println("Fictorial of "+range +"is :"+result );
		
	}
}
