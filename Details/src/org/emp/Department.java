package org.emp;

public class Department extends employee {

	@Override
	public void employeeDesignation() {
		System.out.println("Employee Designation: Software Tester");
		
	}
	@Override
	public void employeeName() {
		System.out.println("Employee Name: Jawahar");
	}
	
	public static void main(String[] args) {
		Department dept = new Department();
		dept.employeeDesignation();
		dept.employeeName();
	}
}
