package com.dollarsbank.controller;

import com.dollarsbank.application.DollarsBankApplication;
import com.dollarsbank.model.Customer;
import com.dollarsbank.utility.ColorsUtility;
import com.dollarsbank.utility.ConsolePrinterUtility;

public class BankingController {
	Customer customer;
	public BankingController(Customer cust) {
		this.customer = cust;
	}
	
	public void handle() {
		while (true) {
			System.out.println(ColorsUtility.ANSI_BLUE + "+-------------------+");
			System.out.println("| Welcome Customer! |");
			System.out.println("+-------------------+" + ColorsUtility.ANSI_RESET);
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Funds Transfer");
			System.out.println("4. View 5 Recent Transactions");
			System.out.println("5. Display Customer Information");
			System.out.println("6. Sign Out");
			System.out.println(
					ColorsUtility.ANSI_GREEN + "Enter Choice (1, 2, 3, 4, 5 or 6):" + ColorsUtility.ANSI_RESET);

			System.out.println(ColorsUtility.ANSI_GREEN);
			int option = ConsolePrinterUtility.readIntInput(DollarsBankApplication.getScanner());
			switch (option) {
			case 1:
				System.out.println(ColorsUtility.ANSI_RESET + "Enter amount to be deposited:");
				System.out.println(ColorsUtility.ANSI_CYAN);
				int amount = ConsolePrinterUtility.readIntInput(DollarsBankApplication.getScanner());
				double newBalance = this.customer.accounts.get(0).getBalance() + amount;
				this.customer.accounts.get(0).setBalance(newBalance);
				break;
			case 2:
				System.out.println(ColorsUtility.ANSI_RESET + "Enter amount to be withdrawn:");
				System.out.println(ColorsUtility.ANSI_CYAN);
				int withdrawn = ConsolePrinterUtility.readIntInput(DollarsBankApplication.getScanner());
				// check if the customer is drawing more than what he/she has
				double newWith = this.customer.accounts.get(0).getBalance() - withdrawn;
				this.customer.accounts.get(0).setBalance(newWith);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println(ColorsUtility.ANSI_BLUE + "+-------------------------------+");
				System.out.println("| Display Customer Information: |");
				System.out.println("+-------------------------------+");
				System.out.println(ColorsUtility.ANSI_RESET + "Customer name:" + customer.getName());
				System.out.println("Customer Address:" + customer.getAddress());
				System.out.println("Customer phone:" + customer.getPhone());
				System.out.println("Customer user id:" + customer.getUserId());
				System.out.println("Account id:" + customer.accounts.get(0).getAccountId());
				System.out.println("Balance:" + customer.accounts.get(0).getBalance());
				System.out.println();
				break;
			case 6:
				System.out.println("Logging out. Thank you and have a nice day!");
				System.out.println();
				return;
			}
		}
	}
}
