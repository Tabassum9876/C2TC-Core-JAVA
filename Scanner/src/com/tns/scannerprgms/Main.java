package com.tns.scannerprgms;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter name");
		System.out.println("Enter gender");
		System.out.println("Enter age");
		System.out.println("Enter mobileno");
		System.out.println("Enter cgpa");
			
		
		String name=sc.nextLine();
		char gender=sc.next().charAt(0);
		int age=sc.nextInt();
		long mobileNo=sc.nextLong();
		double cgpa=sc.nextDouble();
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Mobile NUMBER: "+mobileNo);
		System.out.println("CGPA: "+cgpa);
		
	}

}
