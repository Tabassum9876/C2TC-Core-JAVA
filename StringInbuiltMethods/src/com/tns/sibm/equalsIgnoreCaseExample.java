package com.tns.sibm;

public class equalsIgnoreCaseExample {

	public static void main(String[] args) {
		String s1="The Walking Dead";
		String s2="The Walking Dead";
		String s3="THE WALKING DEAD";
		String s4="THE WEST WEEDS";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));   
		
		
	}

}
