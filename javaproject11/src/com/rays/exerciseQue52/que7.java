package com.rays.exerciseQue52;

public class que7 {
 public static void main(String[] args) {
	 int sum = 0;
	 System.out.println("numbers divisible by 7 between 100 to 200 :");
	for(int i=101; i<200 ; i++)
	{
		if(i%7 == 0) {
			System.out.println(i);
			sum = sum + i;
		}
	}
	System.out.println("sum of numvers are " + sum);
}
}
