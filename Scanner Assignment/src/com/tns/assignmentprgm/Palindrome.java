package com.tns.assignmentprgm;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String original, reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number or String");
		int length;
		original=sc.nextLine();
		length=original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse =reverse + original.charAt(i);
		}
		System.out.println("reverse is:" +reverse);
		if(original.equals(reverse))
			System.out.println("The number is Palindrome");
		else
			System.out.println("The number is not a Palindrome");
	
	}

}
