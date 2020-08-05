package com.dollarsbank.controller;

import java.util.ArrayList;
import java.util.UUID;

import com.dollarsbank.application.DollarsBankApplication;
import com.dollarsbank.model.Account;
import com.dollarsbank.model.Customer;
import com.dollarsbank.model.DollarsBankDB;
import com.dollarsbank.utility.ColorsUtility;
import com.dollarsbank.utility.ConsolePrinterUtility;

public class NewUserController {
	DollarsBankDB bankDB;
	
	public NewUserController(DollarsBankDB bankDB) {
		this.bankDB = bankDB;
	}
	
	public void handle() {
		System.out.println(ColorsUtility.ANSI_BLUE + "+--------------------------------+");
		System.out.println("| Enter Details For New Account: |");
		System.out.println("+--------------------------------+" + ColorsUtility.ANSI_RESET);
		ConsolePrinterUtility.readStringInput(DollarsBankApplication.getScanner());

		System.out.println(ColorsUtility.ANSI_RESET + "Customer Name:");
		System.out.println(ColorsUtility.ANSI_CYAN);
		String custName = ConsolePrinterUtility.readStringInput(DollarsBankApplication.getScanner());
		System.out.println(ColorsUtility.ANSI_RESET + "Customer Address:");
		System.out.println(ColorsUtility.ANSI_CYAN);
		String custAddr = ConsolePrinterUtility.readStringInput(DollarsBankApplication.getScanner());

		System.out.println(ColorsUtility.ANSI_RESET + "Customer Phone Number:");
		System.out.println(ColorsUtility.ANSI_CYAN);
		String custContact = ConsolePrinterUtility.readStringInput(DollarsBankApplication.getScanner());

		System.out.println(ColorsUtility.ANSI_RESET + "User Id:");
		System.out.println(ColorsUtility.ANSI_CYAN);
		String custId = ConsolePrinterUtility.readStringInput(DollarsBankApplication.getScanner());


		System.out.println(ColorsUtility.ANSI_RESET + "Password:");
		System.out.println(ColorsUtility.ANSI_CYAN);
		String custPassword = ConsolePrinterUtility.readStringInput(DollarsBankApplication.getScanner());


		System.out.println(ColorsUtility.ANSI_RESET +"Initial Deposit Amount:");
		System.out.println(ColorsUtility.ANSI_CYAN);
		int initialDeposit = ConsolePrinterUtility.readIntInput(DollarsBankApplication.getScanner());

		Customer newCust = new Customer(custName, custAddr, custContact, custId, custPassword);
		String randId = UUID.randomUUID().toString();
		Account newAccount = new Account(randId, (double)initialDeposit);
		newCust.accounts = new ArrayList<Account>();
		newCust.accounts.add(newAccount);
		bankDB.customers.add(newCust);
		
		System.out.println(ColorsUtility.ANSI_GREEN + "Account successfully created!");
		System.out.println();
	}
	
}