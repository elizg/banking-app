package com.dollarsbank.model;

public class SavingsAccount {
	
	private String savingsId;
	private double balance;
	private Customer customer;
	
	public SavingsAccount(String savingsId, double balance, Customer customer) {
		super();
		this.savingsId = savingsId;
		this.balance = balance;
		this.customer = customer;
	}

	public String getSavingsId() {
		return savingsId;
	}

	public void setSavingsId(String savingsId) {
		this.savingsId = savingsId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "SavingsAccount [savingsId=" + savingsId + ", balance=" + balance + ", customer=" + customer + "]";
	}

}
