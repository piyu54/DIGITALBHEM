package com.atminterface;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM
{
	
		private static int balance=100000;
	
		public static int getBalance() 
	{
		return balance;
	}
		public static void setBalance(int balance) 
	{
		ATM.balance = balance;
	}

		public static ArrayList<String> history=new ArrayList<String>();
	
	 	static void updatebalance(int dcash)
	 {
	        balance=balance+dcash;
	 }
	    static void showbalance()
	    {
	        System.out.println(balance);
	    }


	    public void displayMenu()
	{
		Scanner scanner = new Scanner(System.in);

		while (true) 
		{
			System.out.println("\nATM Menu:");
			System.out.println("1. Transactions History");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Transfer");
			System.out.println("5. Quit");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) 
			{
			case 1:
				//TransactionHistory of Account
				TransactionsHistory t = new TransactionsHistory();
				t.transactionhistory();
				break;
			case 2:
				//Withdraw the amount
				Withdraw w = new Withdraw();
				w.withdrawMoney();
				break;
			case 3:
				//Deposit the amount
				Deposit d = new Deposit();
				d.depositMoney();
				break;
			case 4:
				//Transfer the amount
				Transfer t1 = new Transfer();
				t1.trasfer();
				break;
			case 5:
				//Exit The ATM Interface
				System.out.println("Exiting ATM. Thank you!");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}

	}
		
}

