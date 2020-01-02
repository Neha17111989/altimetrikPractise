package com.Predefined.functional;

public class FabinociSeries {
	
	public static void main(String[] args) {
		int i=0,j=1,n=10;
		
		for(int k=0;k<n;k++) {
			System.out.print( i +"+ ");
			int sum=i+j;
			i=j;
			j=sum;
		}
	}
}
