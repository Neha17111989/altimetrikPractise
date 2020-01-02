package com.nag;

import java.util.Arrays;

public class SortAll_0_1_2 {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 1, 0, 2, 2, 1,1 };
		// Integer intArray[]=Integer.parseInt(arr);
		// Sort it
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
		for(int i:Sort(arr)) {
			System.out.print(i+",");
		}
		System.out.println();

	}

	private static int[] Sort(int[] arr) {
		int countZero = 0;
		int countOne = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				countZero++;
			if (arr[i] == 1)
				countOne++;
		}
		for(int i=0;i<countZero;i++) {
		arr[i]=0;
		}
		for(int i=countZero;i<(countZero+countOne);i++) {
			arr[i]=1;
		}
		for(int i=countZero+countOne;i<arr.length;i++) {
			arr[i]=2;
		}
		//System.out.println();
		return arr;
		
		
	}

}
