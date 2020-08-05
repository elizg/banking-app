package com.dollarsbank.utility;

import java.util.Scanner;

public class ConsolePrinterUtility {
	
	public static void mainView() {
		System.out.println(ColorsUtility.ANSI_BLUE + "+---------------------------+");
		System.out.println("| DOLLARSBANK Welcomes You! |");
		System.out.println("+---------------------------+" + ColorsUtility.ANSI_RESET);
		System.out.println("1. Create New Account");
		System.out.println("2. Login");
		System.out.println("3. Exit");
		System.out.println(ColorsUtility.ANSI_GREEN + "Enter Choice (1, 2 or 3):"+ ColorsUtility.ANSI_RESET);
	}
	
	public static int readIntInput(Scanner scan) {
		int num = 0;
		while (!scan.hasNextInt()); 
		num = scan.nextInt();
		return num;
	}
	
	public static String readStringInput(Scanner scan) {
		String retStr = null;
		retStr = scan.nextLine();
		return retStr;
	}

}
