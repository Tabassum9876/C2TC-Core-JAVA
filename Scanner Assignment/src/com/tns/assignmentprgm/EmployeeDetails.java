package com.tns.assignmentprgm;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter empname");
		System.out.println("Enter empid");
		System.out.println("Enter gender");
		System.out.println("Enter department");
		System.out.println("Enter shift");	
		System.out.println("Enter address");
		System.out.println("Enter Salary");
		System.out.println("Enter mobileno");
		
		String empname=sc.nextLine();
		int empid=sc.nextInt();
		char gender=sc.next().charAt(0);
		String department=sc.nextLine();
		String shift=sc.nextLine();
		String address=sc.nextLine();
		float salary=sc.nextFloat();	
		long mobileNo=sc.nextLong();
		
		System.out.println("EmpName: " + empname);
		System.out.println("EmpID: "+ empid);	
		System.out.println("Gender: "+ gender);
		System.out.println("Department: "+ department);
		System.out.println("shift: "+ shift);
	  	System.out.println("address: "+ address);
		System.out.println("Salary: " + salary);	
		System.out.println("Mobile NUMBER: "+ mobileNo);
		
		
		}

}
