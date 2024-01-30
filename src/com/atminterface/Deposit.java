package com.atminterface;
import java.util.Scanner;

public class Deposit 

{
	 private static double balance = 100000;   
	 public void depositMoney() 
	 {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the amount to deposit: ");
	        double amount = scanner.nextDouble();

	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount. Please enter a positive value.");
	        }
	    }	
}
	  
	


