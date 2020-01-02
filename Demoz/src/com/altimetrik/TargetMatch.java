package com.altimetrik;

import java.util.HashMap;

public class TargetMatch {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 11, 8, 99, 4 };
		int target = 13;
		int[] obj = usingMap(arr, target);
		//int[] obj = //isMatchFound(arr, target);
		System.out.print("{");
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i] + ",");
		}
		System.out.print("}");
	}

	private static int [] usingMap(int[] arr, int target) {
		//int arr[]=arr;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		int numToFind=0;
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
		}
		//finding 
		
		for(int i=0;i<arr.length;i++) {
			numToFind=target-arr[i];//2-13=11
			if(map.containsKey(numToFind)&&map.get(numToFind)!=i) {
				return new int [] {i,map.get(numToFind)};
			}
		}
		return new int [] {-1,-1};
		
		
	}

	private static int[] isMatchFound(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}

			}
		}
		return new int[] { -1, -1 };

	}

}
