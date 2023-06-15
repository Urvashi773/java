package com.rays.exerciseQue52;

public class Que17 {
	 public static void main(String[] args) {
		int[] arr1 = {2,4,6,8,10};
		int[] arr2 = {2,4,6,8,10,12};
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0 ; i<arr1.length; i++) {
			sum1 = sum1 +arr1[i];
			
		}
		for(int i = 0 ; i<arr2.length; i++) {
			sum2 = sum2 +arr2[i];
			
		}
		System.out.println("missing element int the array is = " + Math.abs(sum1-sum2));
	 }
}