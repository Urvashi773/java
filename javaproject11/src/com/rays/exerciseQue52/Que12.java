package com.rays.exerciseQue52;

public class Que12 {
	public static void main(String[] args) {
		int  number = 121;
		int r = 0;
		int sum = 0;
		int temp = number;
		
		while(temp>0) {
			r= temp%10;
			sum = (sum*10)+r;
			temp = temp/10;
		}
	if(sum == number) {
		System.out.println("pallindrome number");
		
	}
	else {
		System.out.println("not");
	}
}

}
