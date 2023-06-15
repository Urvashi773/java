package com.rays.exerciseQue52;

public class que10 {
	public static void main(String[] args) {
		int r = 0;
		int sum = 0;
		int number = 521;
		int temp = number;
		while(temp>0) {
			r = temp%10;
			sum = sum + (r*r*r);
			temp = temp /10;
			
		}if(sum == number) {
			System.out.println("Armstron number" + number);
			
		}else {
			System.out.println("not " + number);
		}
				
	}
 
}
