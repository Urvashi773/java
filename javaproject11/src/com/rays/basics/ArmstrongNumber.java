package com.rays.basics;

public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		
	int number = 153;
	int r = 0;
	int sum = 0;
	int n = number ;
	while(number>0) 
	  {
		r = number%10;
		sum = sum + (r*r*r);
		number = number/10;
		
	  }
	if(sum == n) 
	{
		 System.out.println("Armstrong number");
		 
	}
	else
	{
		 System.out.println(" non Armstrong number");
	}
	
	
    }
}
