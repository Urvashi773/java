package com.rays.exceptionHandling;

public class Account {
	private int balance = 0;
	private String accountNumber = null;
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int deposit(int amount) {
		int total = balance + amount;
		setBalance(total);
		return total;
	}
	
	public int withdraw(int amount) {
		int total = getBalance() - amount;
		if(total<2000) {
			try {
				throw new InsufficientBalanceException();
				
			}
			catch(InsufficientBalanceException e){
				System.out.println(e);
				return total;
			}
		}
			else {
				return total;
			}
		


	}
}
