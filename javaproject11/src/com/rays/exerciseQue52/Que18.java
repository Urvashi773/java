package com.rays.exerciseQue52;

public class Que18 {
	public static void main(String[] args) {
		int[] arr = {5,44,2,7,9,764,87,36,999,19};
		int index = -1;
		int number = 36;
		for(int i = 0; i<arr.length; i++) {
		if(arr[i] == number) {
			index= i;
		}
	}System.out.println(index);

}
}
