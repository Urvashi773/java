package com.rays.exerciseQue52;

public class que6 {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	int n = 10;
	int sum= 0;
	System.out.println( a +"\n"+  b);
	for(int i =1; i <n;i++ ) {
		sum = a+b;
		 System.out.println( sum);
		 a=b;
		 b=sum;
		
	}
	
	
}
}
