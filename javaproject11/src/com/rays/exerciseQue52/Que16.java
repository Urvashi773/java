package com.rays.exerciseQue52;

public class Que16 {
	public static void main(String[] args) {
		int[] arr = { 4, 6, 7, 3, 9, 10, 510, 110 };
		int a = 0;
		int b = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > b) {
				a = b;
				b = arr[i];
			}

			if (a < arr[i] && b > arr[i]) {
				a = arr[i];

			}
		}

		System.out.println("second largest number is " + a);
	}

}
