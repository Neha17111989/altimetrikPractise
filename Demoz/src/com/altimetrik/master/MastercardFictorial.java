package com.altimetrik.master;

public class MastercardFictorial {

	public static void main(String[] args) {
		int num=5;
		int init=1;
		int count=1;
		/*
		 * while(init<=num) { count =count*num; num--; }
		 */
		
		for(int i=1;i<=num;i++) {
			count =count * i;
			//num--;
		}
		System.out.println("Fictorial of "+ 5 +" : "+count);
	}

}
