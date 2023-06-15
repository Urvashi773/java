package com.rays.exerciseQue52;

public class Que15 {
	public static void main(String[] args) {
		int[] arr = {2,5,3,7,4,0,8,99,67,4,100};
		
		int a= 0;
		
		int max = arr[a];

		for(int i = 0; i<arr.length; i++) {
			if(arr[a]< arr[i]) {
				
				arr[a] = arr[i];
			}
			
		
		}System.out.println(arr[a]);	
		
	}

}
