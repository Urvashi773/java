package com.rays.basics;

public class Pallindrome {
	public static void main(String[] args) {
		int number = 12321;
		int n = number;
		int sum = 0;
		int r = 0 ; 
		while(number>0) {
			r = number%10;
			sum = (sum*10)+r;
			number = number/10;
			
			
		}
		if(n == sum) {
			 System.out.println("palindrome number " + n);
		} else {
			System.out.println("non apllindrome number" + n);
		}
	}

}
