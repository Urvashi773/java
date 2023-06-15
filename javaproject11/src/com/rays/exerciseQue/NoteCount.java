package com.rays.exerciseQue;

public class NoteCount {
	public static void main(String[] args) {
		int[] arr = {2000,500,200,100,50,20,10,5,1};
		int count = 0;
		int r;
		int amt = 56789;
		while(amt>=2000) {
			count = amt/2000;
			r = amt%2000;
			System.out.println("2000 - " + count);
			amt = r;
			count = 0;
		}
		while(amt >= 500){
			count = amt/500;
			r = amt%500;
			System.out.println("500 - " + count);
			amt = r;
			count = 0;
		}
		while(amt >= 200){
			count = amt/200;
			r = amt%200;
			System.out.println("200 - " + count);
			amt = r;
			count = 0;
		}
		while(amt >= 500){
			count = amt/500;
			r = amt%500;
			System.out.println("500 - " + count);
			amt = r;
			count = 0;
		}
		while(amt >= 100){
			count = amt/100;
			r = amt%100;
			System.out.println("100 - " + count);
			amt = r;
			count = 0;
		}
		while(amt >= 50){
			count = amt/50;
			r = amt%50;
			System.out.println("50 - " + count);
			amt = r;
			count = 0;
		}
		while(amt >= 20){
			count = amt/20;
			r = amt%20;
			System.out.println("20 - " + count);
			amt = r;
			count = 0;
		}
		while(amt >= 10){
			count = amt/10;
			r = amt%10;
			System.out.println("10 - " + count);
			amt = r;
			count = 0;
		}
		while(amt >= 5){
			count = amt/5;
			r = amt%5;
			System.out.println("5 - " + count);
			amt = r;
			count = 0;
		}
		while(amt >= 1){
			count = amt/1;
			r = amt%1;
			System.out.println("1 - " + count);
			amt = r;
			
		}
	}

}
