package Basicprgm;

import java.util.Scanner;

public class employeedetail {

	public static void main(String[] args) {
		String interName;
		int internAge;
		long internPhoneNo;
		String internMail;
		String internAddress;
		float internSalary;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("First Challenge"+"\n"+"Employee Details");
		
	
		
		System.out.println("Employee Name: ");
		interName=sc.nextLine();
		System.out.println("Employee Age: ");
		internAge=sc.nextInt();
		System.out.println("Employee Mobilenum");
		internPhoneNo=sc.nextLong();
		sc.nextLine();// for consider as new line because we use long datatype in mobilenum
		System.out.println("Employee MailAddress");
		internMail=sc.nextLine();
		System.out.println("Employee Address");
		internAddress=sc.nextLine();
		System.out.println("Employee Salary");
		internSalary=sc.nextFloat();
		
		System.out.println("Name: "+interName);
		System.out.println("Age: "+internAge);
		System.out.println("Mobile Number: "+internPhoneNo);
		System.out.println("Email Address: "+internMail);
		System.out.println("Address: "+internAddress);
		System.out.println("Salary: "+internSalary);
		

	}

}
