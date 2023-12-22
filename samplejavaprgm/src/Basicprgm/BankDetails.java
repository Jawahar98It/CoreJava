package Basicprgm;

import java.util.Scanner;

public class BankDetails {

	public static void main(String[] args) {
		String bankName;
		long accountNumber;
		String branchName;
		String customerName;
		double savingBalance,loanAmount;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Third Challenge"+"\n"+"Bank Details");
		
	
		System.out.println("Bank Name: ");
		bankName=sc.nextLine();
		System.out.println("Customer Name: ");
		customerName=sc.nextLine();
		System.out.println("Customer Account Number:");
		accountNumber=sc.nextLong();
		sc.nextLine();// for consider as new line because we use long datatype in accountnum
		System.out.println("Customer Bank Branch Name:");
		branchName=sc.nextLine();
		System.out.println("Customer Saving Balance Amount:");
		savingBalance=sc.nextDouble();
		System.out.println("Customer Loan Amount:");
		loanAmount=sc.nextDouble();
		
		System.out.println("Bank Name: "+bankName);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Branch: "+branchName);
		System.out.println("Savings Amount: "+savingBalance);
		System.out.println("Loan Amount: "+loanAmount);

	}

}
