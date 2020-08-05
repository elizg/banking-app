package com.dollarsbank.controller;

import com.dollarsbank.model.DollarsBankDB;
import com.dollarsbank.utility.ColorsUtility;

public class DollarsBankController {
	DollarsBankDB bankDB;
	
	public DollarsBankController(DollarsBankDB bankDB) {
		this.bankDB = bankDB;
	}
	
	public void handle(int userInput) {
		switch (userInput) {
		case 1:
			NewUserController nuc = new NewUserController(bankDB);
			nuc.handle();
			break;
		case 2:
			LoginController lc = new LoginController(bankDB);
			lc.handle();
			break;
		case 3:
			System.out.println(ColorsUtility.ANSI_RED + "Exiting...");
			System.out.println();
			return;
		}
	}
}
