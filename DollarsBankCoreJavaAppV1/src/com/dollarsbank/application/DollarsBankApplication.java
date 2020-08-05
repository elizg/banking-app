package com.dollarsbank.application;

import java.util.ArrayList;
import java.util.Scanner;

import com.dollarsbank.controller.DollarsBankController;
import com.dollarsbank.model.Customer;
import com.dollarsbank.model.DollarsBankDB;
import com.dollarsbank.utility.ConsolePrinterUtility;

public class DollarsBankApplication {
	static Scanner scan = null;
	
	public static Scanner getScanner() {
		return scan;
	}

	public static void main(String[] args) {
		DollarsBankDB bankDB = new DollarsBankDB();
		bankDB.customers = new ArrayList<Customer>();
		DollarsBankApplication.scan = new Scanner(System.in);
		
		int intInput = 0;
		while (true) {
			ConsolePrinterUtility.mainView();
			intInput = ConsolePrinterUtility.readIntInput(DollarsBankApplication.getScanner());
			if (intInput == 4) break;
			DollarsBankController dbc = new DollarsBankController(bankDB);
			dbc.handle(intInput);
		}
	}
}
