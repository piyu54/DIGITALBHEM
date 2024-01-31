package com.atminterface;

import java.util.Scanner;

public class Transfer 
{
	public void trasfer()
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the account number of the receiving account");
	int num = sc.nextInt();
	System.out.println("Enter the amount to be transferred :");
	int tcash=sc.nextInt();
	
	if(tcash<=ATM.getBalance())
	{
		ATM.setBalance(ATM.getBalance() - tcash);
		ATM.history.add(Integer.toString(tcash));
		ATM.history.add("Transferred");
		System.out.println("Amount Rs." + tcash + "/- Transferred successfully");
		System.out.println("Update Balance is "+ATM.getBalance());
		System.out.println("---------------------------");
	}else
	{
		System.out.println("Insufficient balance to transfer the cash");
		System.out.println("---------------------------");
	}
}

}
