package com.dollarsbank.model;

public class Transaction {
	
	enum TransactionType {
		TRANSACTION_WITHDRAWAL,
		TRANSACTION_DEPOSIT,
		TRANSACTION_TRANSFER
	};
	
	TransactionType tType;
	double tAmount;
	String tAccount1;
	String tAccount2;
	
	public TransactionType gettType() {
		return tType;
	}
	public void settType(TransactionType tType) {
		this.tType = tType;
	}
	public double gettAmount() {
		return tAmount;
	}
	public void settAmount(double tAmount) {
		this.tAmount = tAmount;
	}
	public String gettAccount1() {
		return tAccount1;
	}
	public void settAccount1(String tAccount1) {
		this.tAccount1 = tAccount1;
	}
	public String gettAccount2() {
		return tAccount2;
	}
	public void settAccount2(String tAccount2) {
		this.tAccount2 = tAccount2;
	}
	
}
