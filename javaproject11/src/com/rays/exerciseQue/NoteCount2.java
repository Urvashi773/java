package com.rays.exerciseQue;

public class NoteCount2 {
	public static void main(String[] args) {
		int[] arr = {2000,500,200,100,50,20,10,5,1};
		int count = 0;
		int r=0;
		int amt = 56789;
		
		for(int i  = 0;i<arr.length;i++) {
			count = amt/arr[i];
			if(count!=0) {
				System.out.println(arr[i] + "-"+ count );
				
			}
			amt = amt%arr[i];
			}
	}
}
