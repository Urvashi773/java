package com.rays.basics;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 6;
		int count = 0;
		for(int i = 2 ; i<n; i++)
		{
			if(n%i == 0)
			{
				count++;
			}	
		}
		if(count == 0) {
			System.out.println("prime numner");
			
		}
		else{
			System.out.println("non prime");
		}
	}

}
