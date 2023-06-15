package com.rays.exerciseQue52;

public class Que11 {
	 public static void main(String[] args) {
		int i = 11;
		int count = 0;
		for(int a = 2; a< i; a++) {
			if(i % 2 == 0) {
				count ++;
			}
			
			
		}
		if(count>0) {
			System.out.println("not a prime number");
		}
		else {
			System.out.println("prime number");
		}
	}

}
