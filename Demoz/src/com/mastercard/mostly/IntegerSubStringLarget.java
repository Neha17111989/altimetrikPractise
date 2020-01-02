package com.mastercard.mostly;

import java.util.ArrayList;
import java.util.List;

public class IntegerSubStringLarget {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1,1 };
		largestSubString(arr);

	}
	static int maxZeroList = 0;
	static int maxOneList = 0;

	private static void largestSubString(int[] arr) {
		int zeroCount = 0;
		int oneCount = 0;
		List<Integer> zeroList = new ArrayList();
		List<Integer> oneList = new ArrayList();
		

		for (int i = 0; i < arr.length; i++) {
			// int arr[] = { 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1 };
			if (arr[i] == 0) {
				zeroCount++; // 
				zeroList.add(arr[i]); //0+0
				int size = zeroList.size(); //2
				
				if(size>0) {
					maxZeroList=size;
				}
				oneList.clear();
			}
			if (arr[i] == 1) {
				oneCount++;
				oneList.add(arr[i]);
				int size=oneList.size();
				if(size>0) {
					maxOneList=size;
				}
				
				zeroList.clear();
			}

			
		}
		System.out.println("Count 0 number : " + maxZeroList);
		System.out.println("Count 1 number : " + maxOneList);

	}

}
