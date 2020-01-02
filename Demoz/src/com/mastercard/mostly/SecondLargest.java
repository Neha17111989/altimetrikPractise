package com.mastercard.mostly;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,1,8,9};
		SecondLarge(arr);
		

	}

	private static void SecondLarge(int[] arr) {
		int FirstLargest=arr[0];//1
		int secondLargest=0;
		for(int i=0;i<arr.length;i++) {
			if(FirstLargest<arr[i]) { //1<2
				secondLargest=FirstLargest;
				FirstLargest=arr[i];
				 
			}
		}
		System.out.println("Second largest is "+secondLargest);
	}

}
