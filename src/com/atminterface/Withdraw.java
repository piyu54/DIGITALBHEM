package com.atminterface;

import java.util.Scanner;

public class Withdraw {

	public  void withdrawMoney() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw: ");
		int wcash = scanner.nextInt();

		if (wcash <= ATM.getBalance()) 
		{
			ATM.setBalance(ATM.getBalance() - wcash);
			ATM.history.add(Integer.toString(wcash));
			ATM.history.add("Withdraw");
			System.out.println("Amount Rs" + wcash + " /-Withdraw successfully");
			System.out.println("Update Balance is "+ATM.getBalance());
			System.out.println("---------------------------");
		} 
		else 
		{
			System.out.println("Insufficient balance to withdraw the cash");
			System.out.println("---------------------------");

		}
	}
}
