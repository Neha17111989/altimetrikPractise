package com.alti.before78hours;

public class Q5_FabinociSercies {

	public static void main(String[] args) {
		int t1=0;
		int t2=1;
		int range=5;
		for(int i=1;i<=range;i++) {
			System.out.print(t1 +": ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}
	}
}
