package com.atminterface;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("WELCOME TO ATM INTERFACE !");
		        System.out.print("Enter User ID: ");
		        String userId = scanner.nextLine();

		        System.out.print("Enter PIN: ");
		        String pin = scanner.nextLine();
		        System.out.println("\nSuccessfully Enter");
		        ATM a = new ATM();
		        a.displayMenu();
		
		
	}
}
