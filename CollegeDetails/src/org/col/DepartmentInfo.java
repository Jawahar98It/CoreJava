package org.col;

import java.util.Scanner;

public class DepartmentInfo {
	
	 void ug(String Name,String Dept) {
		System.out.println("Student Name: "+Name+"\n"+"Student Department: "+Dept);

	}
void ug(short fromyear, short toyear)
{
	System.out.println("Start Year: "+fromyear+"\n"+"End Year: "+toyear);
}
void ug(double percent)
{
	System.out.println("Student Overall Percentage: "+percent);
}
	public static void main(String[] args) {
		DepartmentInfo dept = new DepartmentInfo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("College Details");
		System.out.println("Student Name:");
		String stuname=sc.nextLine();
		System.out.println("Student Dept:");
		String studept=sc.nextLine();
		System.out.println("Joining Year:");
		short startyear=sc.nextShort();
		System.out.println("Ending Year:");
		short endyear=sc.nextShort();
		System.out.println("Student Percentage:");
		double percentage=sc.nextDouble();
		
		dept.ug(stuname,studept);
		dept.ug(startyear,endyear);
		dept.ug(percentage);
	}

}
