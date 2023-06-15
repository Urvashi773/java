package com.rays.exerciseQue52;

public class que5 {
	 public static void main(String[] args) {
		int number = 120;
		int sum = 0;
		int temp= number;
		int r = 0;
		while(number != 0)
		{
			r= number%10;
			sum = (sum*10) + r;
			number = number /10;
		}
		System.out.println("reverse of " + temp + " is " + sum);
		
	}

}
