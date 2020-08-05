package com.dollarsbank.controller;

import com.dollarsbank.application.DollarsBankApplication;
import com.dollarsbank.model.Customer;
import com.dollarsbank.model.DollarsBankDB;
import com.dollarsbank.utility.ColorsUtility;
import com.dollarsbank.utility.ConsolePrinterUtility;

public class LoginController {
	DollarsBankDB bankDB;
	
	public LoginController(DollarsBankDB bankDB) {
		this.bankDB = bankDB;
	}
	
	public void handle() {
		System.out.println(ColorsUtility.ANSI_BLUE + "+----------------------+");
		System.out.println(ColorsUtility.ANSI_BLUE + "| Enter Login Details: |");
		System.out.println(ColorsUtility.ANSI_BLUE + "+----------------------+");

		System.out.println(ColorsUtility.ANSI_RESET + "User Id:");
		ConsolePrinterUtility.readStringInput(DollarsBankApplication.getScanner());
		System.out.println(ColorsUtility.ANSI_CYAN);
		String custId = ConsolePrinterUtility.readStringInput(DollarsBankApplication.getScanner());

		System.out.println(ColorsUtility.ANSI_RESET + "Password:");
		System.out.println(ColorsUtility.ANSI_CYAN);
		String custPassword = ConsolePrinterUtility.readStringInput(DollarsBankApplication.getScanner());

		Customer loginCustomer = null;
		for (Customer cust : bankDB.customers) {
			if (cust.getUserId().equals(custId) && cust.getPw().equals(custPassword)) {
				loginCustomer = cust;
			}
		}
		if (loginCustomer == null) {
			System.out.println(ColorsUtility.ANSI_RED + "Invalid credentials, try again!");
			System.out.println();
			return;
		}
		System.out.println(ColorsUtility.ANSI_GREEN + "Login successful!");
		System.out.println();

		BankingController bankingController = new BankingController(loginCustomer);
		bankingController.handle();
	}
}
