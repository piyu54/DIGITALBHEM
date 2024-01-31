package com.atminterface;
import java.util.Scanner;

public class Deposit 

{
	 public  void depositMoney() 
	 {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the amount to Deposit: ");
	        int dcash=scanner.nextInt();
	        ATM.updatebalance(dcash);
	        ATM.history.add(Integer.toString(dcash));
	        ATM.history.add("Deposit");
	        System.out.println("Amount Rs."+dcash+"/- Deposit Successful!");
	        System.out.println("Update Balance is "+ATM.getBalance());
	        System.out.println("---------------------------");
	       
	    }	
}
	  
	


