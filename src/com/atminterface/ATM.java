package com.atminterface;

import java.util.Scanner;

public class ATM 
{
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Welcome to the ATM!");
	        System.out.println("Enter your Account number");
	        int choice1 = scanner.nextInt();
	        System.out.println("Enter your 4 Digit Pin");
	        int choice2 = scanner.nextInt();
	        System.out.println("Successfully Enter");
	        System.out.println("Enter your choice");
	        System.out.println("1. Deposit");
	        System.out.println("2. Withdraw");
	        System.out.println("3. Check balance");
	        System.out.println("4. Exit");

	        int choice = scanner.nextInt();
	       
	        switch (choice) {
	            case 1:
	            
	                Deposit d = new Deposit();
	                d.depositMoney();
	                break;
	            case 2:
	            	
	               Withdraw w = new Withdraw();
	               w.withdrawMoney();
	                break;
	            case 3:
	           
	                CheckBalance c = new CheckBalance();
	                c.checkBalance();
	                break;
	            case 4:
	                System.out.println("Thank you for using the ATM!");
                    System.exit(0);
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }
	    }
}
