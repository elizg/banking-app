package com.dollarsbank.model;

import java.util.ArrayList;

public class Account {

	private String accountId;
	private double balance;
	
	private ArrayList<Transaction> transactions;

	public Account(String accountId, double balance) {
		super();
		this.accountId = accountId;
		this.balance = balance;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccount_id(String accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ArrayList<Transaction> getTransaction() {
		return transactions;
	}

	public void setTransaction(ArrayList<Transaction> transaction) {
		this.transactions = transaction;
	}

	@Override
	public String toString() {
		return "Account [account_id=" + accountId  + ", balance=" + balance + ", transaction="
				+ transactions + "]";
	}
	
}

	