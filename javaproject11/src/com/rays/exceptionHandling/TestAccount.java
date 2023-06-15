package com.rays.exceptionHandling;
public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(100);
		System.out.println("account balance is- " + a.getBalance());
		a.setAccountNumber("urvashi_7u");
		System.out.println("account number is- " + a.getAccountNumber());
		System.out.println("new balance is after deposite - " + a.deposit(2000));
		System.out.println("new balance is after withdrawl - " + a.withdraw(500));
		
	}


}
